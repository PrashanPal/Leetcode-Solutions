//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)//s420 dp ,easy 1-d dp, same question as the maximize non adjacent sum
    {
        // Your code here
        int p1=arr[0];
        int p2=0;
        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i>1) pick =pick +p2;
            int nonpick=p1;
            int ci=Math.max(pick,nonpick);
            p2=p1;
            p1=ci;
        }//for
        return p1;
    }
}