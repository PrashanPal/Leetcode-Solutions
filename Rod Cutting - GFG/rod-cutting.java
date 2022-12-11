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


class Solution{//memorization code by me
    public int cutRod(int price[], int n) {
        //code here
        int dp[][]=new int[n][n+1];
        for(int[] e:dp) Arrays.fill(e,-1);
        return f(price,dp,n,n-1);
    }
    public int f(int[] p,int[][] dp,int n,int i){
        if(n==0) return 0;
        if(i==0){
            return (n/(i+1))*(p[i]);
        }
        if(dp[i][n]!=-1) return dp[i][n];
        int np=f(p,dp,n,i-1);
        int pp=0;
        if(i+1<=n) pp=p[i]+f(p,dp,n-(i+1),i);
        return dp[i][n]=Math.max(np,pp);
    }
}