public static void coloring_border(int [][] a, int r, int c , int col,int v,boolean b[][]){
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
coloring_border(a,r-1,c,col,v,b);
coloring_border(a,r,c-1,col,v,b);
coloring_border(a,r+1,c,col,v,b);
coloring_border(a,r,c+1,col,v,b);
}//final if
}//fn
[[2,1,3,2,1,1,2],[1,2,3,1,2,1,2],[1,2,1,2,2,2,2],[2,1,2,2,2,2,2],[2,3,3,3,2,1,2]]
4
4
3