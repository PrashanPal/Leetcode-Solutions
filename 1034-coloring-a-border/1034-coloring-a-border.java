class Solution {
    // METHODE 2:also done by me
    //     it dosent uses extra boolean array for marking visited
    // it uses an extra for loop in main ,for filling color in all the -ve marked cells
    //step1:if mark all the boundary cells by -ve value in it
    //step2:now mark all the -ve value cell by the given color
    public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
        int v=grid[r0][c0];//color to be replaced
       h(grid,r0,c0,color,v);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==-v)
                    grid[i][j]=color;
                 if(grid[i][j]==-color)
                    grid[i][j]=v;
            }
        }
        return grid;
    }
     public  void h(int [][] a, int r, int c , int col,int v){
    if(v==col) return;
    if(r<0||c<0||r==a.length||c==a[0].length){
        return;
      }
      if(r==0||c==0||r+1==a.length||c+1==a[0].length){
        a[r][c]=-v;
      }
          else if(r-1>=0&&a[r-1][c]>0&&a[r-1][c]!=v){//here a[r-1][c])!=v means that a[r-1][c])!=v && a[r-1][c])!=-v
        a[r][c]=-v;// -v==> bounday cell
      }
       else if(c-1>=0&&a[r][c-1]>0&&a[r][c-1]!=v){
        a[r][c]=-v;
      }
       else if(r+1<a.length&&a[r+1][c]>0&&a[r+1][c]!=v){
        a[r][c]=-v;
      }
       else if(c+1<a[0].length&&a[r][c+1]>0&&a[r][c+1]!=v){
        a[r][c]=-v;
      }
         else {
             a[r][c]=-col;// ie.not a boundary cell but visited
         }
      if(r-1>=0&&a[r-1][c]==v)
      h(a,r-1,c,col,v);
          if(c-1>=0&&a[r][c-1]==v)
      h(a,r,c-1,col,v);
          if(r+1<a.length&&a[r+1][c]==v)
      h(a,r+1,c,col,v);
      if (c+1<a[0].length&&a[r][c+1]==v)    
      h(a,r,c+1,col,v);
  }//fn
}