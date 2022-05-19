class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> r=new ArrayList<>();
        List<Integer> t=new ArrayList<>();
        h(graph,r,t,0,graph.length-1);
        return r;
    }
    public void h(int[][] g,List<List<Integer>> r,List<Integer> t,int s,int d){
        if(s==d){
            t.add(d);
            r.add(new ArrayList<>(t));
            return;
        }
        else{
            t.add(s);
            for(int i:g[s]){
                h(g,r,t,i,d);
                t.remove(t.size()-1);
            }
        }
        return;
    }
}