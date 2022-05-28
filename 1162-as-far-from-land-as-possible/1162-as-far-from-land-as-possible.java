class Solution {
    //542 0-1 matrix (compare these 2 question for concept understanding)
    //big TOOL-->multisource BFS
    // notes2--page39
    // question ask to find--->maximum distance of land from water ,i.e. maximum distance of 0(water cell) from         1(land cell)
    //Approach---> find maximum possible radius of multisource BFS of 1
    class p{
        int x;
        int y;
        p(int x,int y){
            this.x=x;
            this.y=y;
        }//p
    }//class
     public int maxDistance(int[][] grid) {
            Queue<p> q=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)//
                    q.add(new p(i,j));
            }//for
        }//for
          if(q.size() == 0 || q.size() == grid.length * grid[0].length) {     //Found no 1's in the grid  //Empty queue
            return -1;                                       //Found no 0's in the grid  //Full queue
        }
        int r=h(grid,q);
         if(r>0) return r;
         return -1;
        
    }//fn
        public int h(int[][] g, Queue<p> q){
            int l=0;//to count no. of hours
                while(q.size()>0){
                    int s=q.size();
                    while(s>0){
                        p t=q.poll();
                        s--;
            if(t.x-1>=0&&g[t.x-1][t.y]==0){
                g[t.x-1][t.y]=1;//to mark it visited or rotten
                    q.add(new p(t.x-1,t.y));
                }//if
                        if(t.y-1>=0&&g[t.x][t.y-1]==0){
                g[t.x][t.y-1]=1;//to mark it visited or rotten
                    q.add(new p(t.x,t.y-1));
                }//if
                        if(t.x+1<g.length&&g[t.x+1][t.y]==0){
                g[t.x+1][t.y]=1;//to mark it visited or rotten
                    q.add(new p(t.x+1,t.y));
                }//if
                        if(t.y+1<g[0].length&&g[t.x][t.y+1]==0){
                g[t.x][t.y+1]=1;//to mark it visited or rotten
                    q.add(new p(t.x,t.y+1));
                }//if
                   
            }//while
                    if(q.size()>0) l++;
                }//while
             return l;
        }//fn
    }//class