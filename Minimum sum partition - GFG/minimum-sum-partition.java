//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java



//User function Template for Java


//User function Template for Java



//User function Template for Java



//User function Template for Java


//User function Template for Java

class Solution
{//here in this question nums always contains +ve value hence it is much easier as compared to leetcode whoes array 
//can also contains -ve elements too
// this is my memorization approach;
	 public int minDifference(int[] nums,int n) {
       // int n=nums.length;
        int s=0;//it will store total sum of elements in the array nums
        for(int i=0;i<n;i++)
        s=s+nums[i];
        int t=s/2;// this t is our target
        //now we have to find the subsequence sum who ie <=t, .i.e maximum value of sum possible which is <=target
        // this approach will definetily works when all the elements in the array are positive
        int[] m={Integer.MIN_VALUE};
        int dp[][]=new int[n][t+1];
        for(int i=0;i<n;i++)
        for(int j=0;j<=t;j++)
        dp[i][j]=-1;
        
        f(nums,dp,n-1,t,m,0,0);
        //System.out.println("*"+m[0]+"*");
        return s-m[0]*2;
    }
    public int f(int[] a,int dp[][],int n,int t,int m[],int s,int c){//here is to count total no. of lements get picked in one subsequence
    if(c==a.length) return Integer.MIN_VALUE;//very important ,bcz you cant pick all the array elements in one sequence
          if(s>t) return Integer.MIN_VALUE;
        if(s==t){
           return m[0]=t;
        }
        if(n==-1&&s<=t){
           return m[0]=Math.max(m[0],s);
        }
        if(n<0) return Integer.MIN_VALUE;//not here you cant wirte n<=0
        if(dp[n][s]!=-1){
           return m[0]=Math.max(m[0],dp[n][s]);
        }
        if(m[0]==t) return dp[n][s]=t;
      
       int p= f(a,dp,n-1,t,m,s+a[n],c+1);// it will work as pick 
        int np= f(a,dp,n-1,t,m,s,c);//it will work as nonpick
      return  dp[n][s]=Math.max(m[0],Math.max(np,p));
    }//fn
}