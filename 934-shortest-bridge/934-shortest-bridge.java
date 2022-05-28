class Solution {
    //aproach used BFS----TOOL (usefull approach)
    //it is given that there are exactly 2 islands
    //we just find an island and put its all 1s for multisource BFS 
    // we apply BfS untill i found the 1 of next island
    //now level or radius is equal to no. of 0s needs to be flipped
    //n2-41
    class P{
        int x;
        int y;
        P(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int shortestBridge(int[][] grid) {
        boolean f=false;
        Queue<P> q=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1&&f==false){//just to sent 1st indixes of 1st island
                m(grid,i,j,q);
                    f=true;
            }//if
        }//for
        }//for
        int l=0;
        while(q.size()>0){
            int s=q.size();
            while(s>0){
                P t=q.poll();
                s--;
                if(t.x-1>=0&&grid[t.x-1][t.y]==0){
                    grid[t.x-1][t.y]=-1;//marked visited
                    q.add(new P(t.x-1,t.y));
                }
                if(t.x-1>=0&&grid[t.x-1][t.y]==1) return l;//if you get the 1 of 2nd island
                
                 if(t.y-1>=0&&grid[t.x][t.y-1]==0){
                    grid[t.x][t.y-1]=-1;//marked visited
                    q.add(new P(t.x,t.y-1));
                }
                 if(t.y-1>=0&&grid[t.x][t.y-1]==1) return l;
                
                 if(t.x+1<grid.length&&grid[t.x+1][t.y]==0){
                    grid[t.x+1][t.y]=-1;//marked visited
                    q.add(new P(t.x+1,t.y));
                }
                 if(t.x+1<grid.length&&grid[t.x+1][t.y]==1) return l;
                
                 if(t.y+1<grid[0].length&&grid[t.x][t.y+1]==0){
                    grid[t.x][t.y+1]=-1;//marked visited
                    q.add(new P(t.x,t.y+1));
                }
                 if(t.y+1<grid[0].length&&grid[t.x][t.y+1]==1) return l;
                
            }//while
            l++;
        }//while
        return l-1;
    }
    public void m(int[][] g,int i,int j,Queue<P> q){
        if(i<0||j<0||i==g.length||j==g[0].length) return;
        if(g[i][j]==1){
            g[i][j]=-1;//marked visited
            q.add(new P(i,j));
            m(g,i-1,j,q);
            m(g,i,j-1,q);
            m(g,i+1,j,q);
            m(g,i,j+1,q);
        }
    }
}