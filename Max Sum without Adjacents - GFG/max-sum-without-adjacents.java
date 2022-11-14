//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//approach of pick and non-pick is used
class Solution {//since recursive approach gives me TLE ,so here i am using memorization approach
    int findMaxSum(int arr[], int n) {
        // code here
        int dp[]=new int[n];//to store maximum possible value for each index ,starting from the last
        Arrays.fill(dp,-1);
        return f(arr,dp,n-1);
    }
    public int f(int a[],int[] dp,int i){
       
        if(i==0) return a[i];
        if(i<0) return 0;
         if(dp[i]!=-1) return dp[i];
        int pick= a[i] + f(a,dp,i-2);
        int npick=0+f(a,dp,i-1);
        return dp[i]=Math.max(pick,npick);
    }//fn
}//class