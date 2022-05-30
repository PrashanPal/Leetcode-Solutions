class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=0;
        //int c[]={0};
         for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1){
                int c=p(grid,i,j,0);
                m=Math.max(m,c);
            }//if
        }//for
         }//for
            return m;
    }//solve
   
     public int p(int[][] g,int i,int j,int c){
        if(i<0||j<0||i>=g.length||j>=g[i].length) return c;
        if(g[i][j]==1){
            g[i][j]=0;
            c++;
            c=p(g,i-1,j,c);
            c=p(g,i,j-1,c);
            c=p(g,i+1,j,c);
            c=p(g,i,j+1,c);
        }//if
         return c;
    }//p
}