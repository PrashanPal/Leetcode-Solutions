//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j]  =Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            obj.shortest_distance(matrix);
            for(int i = 0; i < n; i++){
                for(int j  = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //s450 ,graph->15.4,n2-80
    //to easy to code and understand if you see n2-80
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        //since we have to do it in-place and hence we are not using and extra costmatrix[n][n]
        int n=matrix.length;
        for(int i=0;i<n;i++){//to create our costmatrix
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1) matrix[i][j]=(int)1e9;
                if(i==j) matrix[i][j]=0;
            }//for j
        }//for i
        //main logic of our floyd warshall algorith
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);//ie movin i to j ,via k
                }//for j
            }//for i
        }//for k
        //to detect it contains negative weight cycle
        // for(int i=0;i<n;i++){
        //     if(matrix[i][i]<0){
        //         --->it means it constians negative weight cycle
        //     }//if
        // }//for
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==(int)1e9) matrix[i][j]=-1;//i.e path doesnt exit between i and j
            }//for
        }//for
    }//fn
}//class