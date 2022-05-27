class Solution {
    public int numEnclaves(int[][] grid) {
       int c=0;
        //Approach: steps1: mark all the connected cell of boundary 1 as 0
        //         now cells of all components who are touching boundary are marked as 0
        //         step2: count all the 1 left in the updated grid
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if((i==0||j==0||i+1==grid.length||j+1==grid[0].length)&&grid[i][j]==1){
                    h(grid,i,j);
                }//if
            }//for
        }//for
             for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    c++;
                }//if
            }//for
        return c;
    }
    public  void h(int[][] g,int i,int j){
        g[i][j]=0;
        if(i-1>=0&&g[i-1][j]==1)
            h(g,i-1,j);
         if(j-1>=0&&g[i][j-1]==1)
             h(g,i,j-1);
         if(i+1<g.length&&g[i+1][j]==1)
             h(g,i+1,j);
         if(j+1<g[0].length&&g[i][j+1]==1)
             h(g,i,j+1);
    }
}