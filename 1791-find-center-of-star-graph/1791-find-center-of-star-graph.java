class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[0].length;j++){
                if(h.containsKey(edges[i][j])){
                    return edges[i][j];
                }
                else{
                    h.put(edges[i][j],0);
                }
            }//for
        }//for
        return 0;
    }
}