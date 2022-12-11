//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
// 2 7 this
// 1 1
// 2 4

class Solution{//this is mine memorization code and it is simple and systematic
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
      int dp[][]=new int[N][W+1];
        for(int[] e:dp) Arrays.fill(e,-1);
        return f(wt,val,N-1,W,dp);
    }
    public static int f(int wt[],int val[],int ind,int W ,int dp[][]){
        if(W==0) return 0;
    if(ind == 0){
       // return ((int)(W/wt[0])) * val[0];
       if(wt[0]<=W) return (W/wt[0])*val[0];
       return 0;//i.e wt[0]>W
    }
    
    if(dp[ind][W]!=-1)
        return dp[ind][W];
        
    int notTaken = 0 + f(wt,val,ind-1,W,dp);
    
    int taken = Integer.MIN_VALUE;
    if(wt[ind] <= W)
        taken = val[ind] + f(wt,val,ind,W-wt[ind],dp);
        
    return dp[ind][W] = Math.max(notTaken,taken);
    }
}