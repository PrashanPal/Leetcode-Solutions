ans = Math.max(ans, count);
}
return ans;
}
​
private void dfs(int idx, boolean[] v, int[][] bombs) {
count++;
v[idx] = true;
int n = bombs.length;
for (int i = 0; i < n; i++) {
if (!v[i] && inRange(bombs[idx], bombs[i])) {
v[i] = true;
dfs(i, v, bombs);
}
}
}
​
private boolean inRange(int[] a, int[] b) {
long dx = a[0] - b[0], dy = a[1] - b[1], r = a[2];
return dx * dx + dy * dy <= r * r;
}
class Solution {
class p{
int x;
int y;
int r;
int i;
p(int x,int y,int r,int i){
this.x=x;
this.y=y;
this.r=r;//radius
this.i=i;//index to be marked true in boolean array while performing multi source BFS
}
}
public int maximumDetonation(int[][] bombs) {
int m=0;//to count maximum no. of bombs counted
boolean b[]=new boolean[bombs.length];//to counted visited bombs in each call
Queue<p> q=new ArrayDeque<>();
for(int i=0;i<bombs.length;i++){
Arrays.fill(b,false);
int c=h(bombs,i,q,b,0);
m=Math.max(m,c);
}//for