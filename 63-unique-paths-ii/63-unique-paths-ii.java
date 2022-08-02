class Solution {
    //n2--126 very important  question for understanding DP
    //since this method is bruteforce and not DP based so it gives TLE
    //the method0:is bruteforce so it gives TLE 
    //this is method1:DP solution using 2-D array
    
    //exaple: [[0,0,0,0,1,0,0],[1,0,1,0,0,0,0], [0,0,0,0,0,0,0]]
    
    //An easier way to understand, but more space complexity.
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //for easy understanding ,just understand this question with the above example
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] path = new int[n][m];
        for (int i = 0; i < n; i++) {//converting all the 1 at 0th column to 0 and its follows to also 0
            if (obstacleGrid[i][0] == 1) {
                while (i < n) {
                    path[i][0] = 0;
                    i++;
                }
            } else {
                path[i][0] = 1;
            }
        }

        for (int j = 0; j < m; j++) {
            if (obstacleGrid[0][j] == 1) {
                while (j < m) {
                    path[0][j] = 0;
                    j++;
                }
            } else {
                path[0][j] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 0) {
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
                } else path[i][j] = 0;
            }
        }
        return path[n - 1][m - 1];
    }
}
//     More explanation:
// This is a typical 2D DP problem, we can store value in 2D DP array, but since we only need to use value at dp[i - 1][j] and dp[i][j - 1] to update dp[i][j], we don't need to store the whole 2D table, but instead store value in an 1D array, and update data by using dp[j] = dp[j] + dp[j - 1], (where here dp[j] corresponding to the dp[i - 1][j]) and dp[j - 1] corresponding to the dp[i][j - 1] in the 2D array)

