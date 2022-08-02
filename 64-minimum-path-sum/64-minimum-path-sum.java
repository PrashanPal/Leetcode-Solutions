class Solution {
    //n2--128 this question is very importand for basic understanding bro
    //approach0:brutefroce approach is to find sum for all the paths and return minimum sum ,but it will give TLE
    //approach1:DP based approach ,using concept of question 63 and 62 ,i will use 2-D array for storing minimum sum to that shell
    //approach2: DP solution bt by using 1-D approach
    
    //this is approach1
    public int minPathSum(int[][] grid) {
        int m=grid.length;//no. of  rows
        int n=grid[0].length;// no. of columns
     int dp[][] =new int[m][n];
        dp[0][0]=grid[0][0];
        int i=1;
        while(i<m){//no of rows
            dp[i][0]=dp[i-1][0]+grid[i][0]; 
            i++;
        }
         int j=1;
        while(j<n){// no. of columns
            dp[0][j]=dp[0][j-1]+grid[0][j];
            j++;
        }
        
        for(int p=1;p<m;p++){
            for(int q=1;q<n;q++){
                dp[p][q]=grid[p][q]+Math.min(dp[p][q-1],dp[p-1][q]);//dp[p][q-1]-->left and dp[p-1][q]-->top
            }//for
        }//for
        return dp[m-1][n-1];
    }
    
    //this approach2: 1-D based solution  ---> to understand this code it is help to understand code of approach1
     // public int minPathSum(int[][] grid) {
     //     int m=grid.length;
     //     int n=grid[0].length;
     //     int dp[]=new int[n];
     //     for(int i=0;i<m;i++){
     //         for(int j=0;j<n;j++){
     //             if(j==0){//i.e. 1st column of each row
     //                 dp[0]=grid[i][0]+dp[0];//it current element of grid + top neighbour in DP array
     //             }//if
     //             else if(j>0){
     //                 if(i==0)//bcz it is the 1st fill of DP array and currently it doesnt have any top neighbour
     //                  dp[j]=grid[0][j]+dp[j-1];//here dp[j-1]-->left neghbour 
     //                 else if(i>0)
     //             dp[j]=grid[i][j]+Math.min(dp[j-1],dp[j]);//here dp[j-1]-->left neghbour,and dp[j]-->top neighbour
     //             }//else if
     //         }//for
     //     }//for
     //     return dp[n-1];//this is the requird solution
     // }//fn
}//class