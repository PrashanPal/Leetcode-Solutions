for(int i=0;i<bombs.length;i++){
Arrays.fill(b,false);
int c=h(bombs,i,q,b,0);
m=Math.max(m,c);
}//for
return m;
}//fn
public int h(int[][] g,int i,Queue<p> q,boolean b[],int c){
q.add(new p(g[i][0],g[i][1],g[i][2],i));
while(q.size()>0){
p t=q.poll();
//if(b[t.i]==false){
b[t.i]=true;//it is necessary to mark bomb visited
c++;
int radius=t.r;
for(int j=0;j<g.length;j++){
if(b[j]==false){
int d=dis(t.x,t.y,g[j][0],g[j][1]);
if(d*d<=radius*radius){
q.add(new p(g[j][0],g[j][1],g[j][2],j));
b[j]=true;
}//if
}//if
}//for
// }//if
}//while
return c;
}//h
public int dis(int x,int y,int x1,int y1){
int a=Math.abs(x-x1);
int b=Math.abs(y-y1);
return a+b;
}//dis
}//class