class Solution {
public class Pair{
int i;
int j;
Pair(int i,int j){
this.i=i;
this.j=j;
}
}
public int islandPerimeter(int[][] grid) {
int res=0;
int r=grid.length;
int c=grid[0].length;
Queue<Pair> q=new ArrayDeque<>();
for(int i=0;i<grid.length;i++){
for(int j=0;j<grid[0].length;j++){
if(grid[i][j]!=2){
q.add(new Pair(i,j));
}//if
}//for
}   //for
while(q.size()>0){
Pair t=q.poll();
if(grid[t.i][t.j]!=2){
int k=0;
grid[t.i][t.j]=2;