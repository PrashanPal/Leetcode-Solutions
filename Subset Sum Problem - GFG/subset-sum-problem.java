//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        //here i am writing simple recursive code which may gives TLE
        // approach: pick and nonpick approach
        // since here two parameters i and target are changing so , i used a 2-d array for dp
        // code here
        int dp[][]=new int[N][sum+1];
        for(int[] e:dp) Arrays.fill(e,-1);
        return f(arr,dp,N,sum,0);
    }
    public static boolean f(int[] a,int[][] dp,int n,int s,int i){
        if(s==0) return true;
        if(i>=n) return false;
        boolean p=false,np=false;
        if(dp[i][s]!=-1){
            if(dp[i][s]==1) return false;
            if(dp[i][s]==2) return true;
        }
        if(s-a[i]>=0){// i.e target will newver becames -ve
           p=f(a,dp,n,s-a[i],i+1);
           if(p==true){
               dp[i][s]=2;//i.e true
               return p;
           }
           else dp[i][s]=1;//i.e false
        }
        np=f(a,dp,n,s,i+1);
        if(np==true){
            dp[i][s]=2;
            return true;
        }
        if(p||np==true) dp[i][s]=2;//i.e true
        else dp[i][s]=1;//i.e false
        return p||np;
    }
}