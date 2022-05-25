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
                if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                }//if
            }//for
        }   //for
        while(q.size()>0){
            Pair t=q.poll();
            if(grid[t.i][t.j]!=2){
                int k=0;
                grid[t.i][t.j]=2;
                if((t.i+1)< r && grid[t.i+1][t.j]==0) k++;
                else if(t.i+1==r) k++;
                 if((t.j+1) <c&&grid[t.i][t.j+1]==0) k++;
                else if(t.j+1==c) k++;
                
                 if((t.i-1)>=0&&grid[t.i-1][t.j]==0) k++;
                else if(t.i-1<0) k++;
                 if((t.j-1)>=0&&grid[t.i][t.j-1]==0) k++;
                else if(t.j-1<0) k++;
                
                if(t.i+1<r&&grid[t.i+1][t.j]==1) q.add(new Pair(t.i+1,t.j));
                 if(t.j+1<c&&grid[t.i][t.j+1]==1) q.add(new Pair(t.i,t.j+1));
                 if(t.i-1>=0&&grid[t.i-1][t.j]==1) q.add(new Pair(t.i-1,t.j));
                 if(t.j-1>=0&&grid[t.i][t.j-1]==1) q.add(new Pair(t.i,t.j-1));
                res=res+k;
            }//if
        }//while
        return res;
    }//main
    
}