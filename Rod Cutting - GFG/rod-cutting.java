//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{//tabulation solution  code by me
// 7
// 1 3 3 3 4 4 6
// time n+n, space n*n;
    public int cutRod(int price[], int n) {
        //code here
        int dp[][]=new int[n][n+1];
        for(int[] e:dp) Arrays.fill(e,-1);
        for(int k=0;k<n;k++) dp[k][0]=0;
        for(int k=0;k<n+1;k++) dp[0][k]=(k/(0+1))*price[0];
        //return f(price,dp,n,n-1);
        
        for(int i=1;i<n;i++){
            for(int j=1;j<n+1;j++){
               int np=dp[i-1][j];
                int p=0;
                if(i+1<=j) p=price[i]+dp[i][j-(i+1)];//here i used (i+1) very cleverly instead of i
                dp[i][j]=Math.max(p,np);
            }//for j
        }//for i
        return dp[n-1][n];
    }
}