class Solution {
    class p{
        int x;
        int y;
        p(int x,int y){
            this.x=x;
            this.y=y;
        }//p
    }//class
    public int orangesRotting(int[][] grid) {
        int k=0;//to count total no. of 1s int the grid initailly
            Queue<p> q=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) q.add(new p(i,j));
                if(grid[i][j]==1) k++;
            }//for
        }//for
        int r[]={0,0};
        h(grid,r,q);
        if(k-r[1]>0)
            return -1;
        return r[0];
        
    }//fn
        public void h(int[][] g,int[] r,  Queue<p> q){
            int l=0;//to count no. of hours
                while(q.size()>0){
                    int s=q.size();
                    while(s>0){
                        p t=q.poll();
                        s--;
            if(t.x-1>=0&&g[t.x-1][t.y]==1){
                g[t.x-1][t.y]=2;//to mark it visited or rotten
                    r[1]+=1;//to count oranges converted
                    q.add(new p(t.x-1,t.y));
                }//if
                        if(t.y-1>=0&&g[t.x][t.y-1]==1){
                g[t.x][t.y-1]=2;//to mark it visited or rotten
                    r[1]+=1;//to count oranges converted
                    q.add(new p(t.x,t.y-1));
                }//if
                        if(t.x+1<g.length&&g[t.x+1][t.y]==1){
                g[t.x+1][t.y]=2;//to mark it visited or rotten
                    r[1]+=1;//to count oranges converted
                    q.add(new p(t.x+1,t.y));
                }//if
                        if(t.y+1<g[0].length&&g[t.x][t.y+1]==1){
                g[t.x][t.y+1]=2;//to mark it visited or rotten
                    r[1]+=1;//to count oranges converted
                    q.add(new p(t.x,t.y+1));
                }//if
                   
            }//while
                    if(q.size()>0) l++;
                }//while
             r[0]=l;
        }//fn
    }//class