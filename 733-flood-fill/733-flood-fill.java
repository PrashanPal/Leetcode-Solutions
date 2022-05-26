class Solution {
    class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int v=image[sr][sc];
        int r=image.length;
        int c=image[0].length;
        if(v==newColor) return image;
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(sr,sc));
        while(q.size()>0){
            Pair t=q.poll();
            if(image[t.i][t.j]==v){
                image[t.i][t.j]=newColor;
                if(t.i+1<r&&image[t.i+1][t.j]==v){
                    q.add(new Pair(t.i+1,t.j));
                }
                if(t.j+1<c&&image[t.i][t.j+1]==v){
                    q.add(new Pair(t.i,t.j+1));
                }
                if(t.i-1>=0&&image[t.i-1][t.j]==v){
                    q.add(new Pair(t.i-1,t.j));
                }
                if(t.j-1>=0&&image[t.i][t.j-1]==v){
                    q.add(new Pair(t.i,t.j-1));
                }
            }
        }
        return image;
    }
}