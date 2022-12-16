//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    //approach : since we have to find the length of shortest common supersequence then ,it means the order of 
    //sequence is matters alot ,so we find the length of largest common subsequence let it is "x" ,then 
    //ans=(n-x)+(m-x)+x;
    //dp-31,n2-281
    //leetcode 1092
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        int x=lcs(X,Y,m,n);
        return (n-x)+(m-x)+x;//ie (n+m-x)
    }
    public static int lcs(String s1,String s2,int m,int n){
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=0+Math.max(dp[i-1][j],dp[i][j-1]);
            }//for j
        }//for i
        return dp[m][n];
    }
}