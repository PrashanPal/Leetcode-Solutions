class Solution {
    // METHODE 1:simple brute force approach by me
    //     problem: it uses an extra boolean array b to mark visited ,because if mark in the same grid by color,it will mark all the to,color which are connect
    public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
        int v=grid[r0][c0];//color to be replaced
            boolean b[][]=new boolean[grid.length][grid[0].length];
       h(grid,r0,c0,color,v,b);
        return grid;
    }
     public  void h(int [][] a, int r, int c , int col,int v,boolean b[][]){
    if(v==col) return;
    if(r<0||c<0||r==a.length||c==a[0].length){
        return;
      }
      if(a[r][c]==v&&b[r][c]==false){
      b[r][c]=true;
      if(r==0||c==0||r+1==a.length||c+1==a[0].length){
        a[r][c]=col;
      }
      else if(r-1>=0&&a[r-1][c]!=v&&b[r-1][c]==false){
        a[r][c]=col;
      }
       else if(c-1>=0&&a[r][c-1]!=v&&b[r][c-1]==false){
        a[r][c]=col;
      }
       else if(r+1<a.length&&a[r+1][c]!=v&&b[r+1][c]==false){
        a[r][c]=col;
      }
       else if(c+1<a[0].length&&a[r][c+1]!=v&&b[r][c+1]==false){
        a[r][c]=col;
      }
      h(a,r-1,c,col,v,b);
      h(a,r,c-1,col,v,b);
      h(a,r+1,c,col,v,b);
      h(a,r,c+1,col,v,b);
      }//final if
  }//fn
}