class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;//row
        int n=grid[0].length;//column
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    h(grid,i,j,m,n);
                    c+=1;
                }//if
            }//for j
        }//for i
        return c;
    }//main
    public void h(char g[][],int i,int j,int m,int n){
    g[i][j]=0;
        if((i+1)<m&&g[i+1][j]=='1'){
            h(g,i+1,j,m,n);
        }
         if((i-1)>=0&&g[i-1][j]=='1'){
            h(g,i-1,j,m,n);
        }
         if((j+1)<n&&g[i][j+1]=='1'){
            h(g,i,j+1,m,n);
        }
         if((j-1)>=0&&g[i][j-1]=='1'){
            h(g,i,j-1,m,n);
        }
    }
}