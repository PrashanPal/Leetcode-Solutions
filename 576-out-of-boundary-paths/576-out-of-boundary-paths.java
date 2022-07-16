class Solution {
//its link is in notes section
    /*
        Approach:
        Recurse in all 4 directions and keep storing the answers gemerated (Memoizing)
        TC : 
            Memoizing - O(rows*cols*MaxMoves) = O(n^3)
            Normal Recursion - O(4 ^ max(rows,cols,MaxMoves) ) = O(4^n)
        
    */
    
    final int dir[][] = { {1,0}, {-1,0}, {0,1}, {0,-1} };
    final int MOD = (int)1e9 + 7;
    
    //renamed variables fpr better understanding
    public int findPaths(int rows, int cols, int maxMoves, int sr, int sc) {
        Integer dp[][][] = new Integer[rows][cols][maxMoves+1]; //initially null
        return helper(rows, cols, maxMoves, sr, sc, dp);
    }//findpaths
    
    int helper( int rows, int cols, int maxMoves, int sr, int sc, Integer dp[][][] )
    {
        if(maxMoves == 0)
            return dp[sr][sc][maxMoves] = 0;
        
        if(dp[sr][sc][maxMoves] != null)
            return dp[sr][sc][maxMoves];
        
        int count = 0;
        for(int d[] : dir) 
        {
            int r = sr + d[0];
            int c = sc + d[1];
            if( r >= 0 && c >= 0 && r < rows && c < cols )  //within bounds
            {
                count = ( count + helper(rows, cols, maxMoves-1, r, c, dp) ) % MOD;
            }
            else     // out of bounds
            {
                count = (count + 1) % MOD;
            }
        }
        return dp[sr][sc][maxMoves] = count;
    }//helper
}//class