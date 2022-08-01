class Solution {
    
    //similar question 63,64,2304,2087,174
    //striver
//this is brute force appraoch so ,it will works well but it results in TLE
    //optimed appraoch: based on backtracking also give TLE
    //n2-->125
    //see side by notes
  
    //DP based solution
    public int uniquePaths(int m, int n) {
        Integer[][] map = new Integer[m][n];
        for(int i = 0; i<m;i++){
            map[i][0] = 1;
        }
        for(int j= 0;j<n;j++){
            map[0][j]=1;
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                map[i][j] = map[i-1][j]+map[i][j-1];
            }
        }
        return map[m-1][n-1];
    }
}
// The assumptions are

// When (n==0||m==0) the function always returns 1 since the robot
// can't go left or up.
// For all other cells. The result = uniquePaths(m-1,n)+uniquePaths(m,n-1)
// Therefore I populated the edges with 1 first and use DP to get the full 2-D array.