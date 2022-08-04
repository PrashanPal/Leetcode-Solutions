class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lr=new ArrayList<>();
      //  Arrays.sort(candidates);// using it is not necessay and will dont affect your solution
        h(lr,candidates,new ArrayList<>(),target,0);
        return lr;
    }
    public void h(List<List<Integer>> lr,int[] a,List<Integer> l,int t,int j){
        if(t==0){
            lr.add(new ArrayList<>(l));
            return;
        }
        else if(t<0)
            return;
           for(int i=j;i<a.length;i++){
                   l.add(a[i]);
                   h(lr,a,l,t-a[i],i);// not i + 1 because we can reuse same elements
                   l.remove(l.size()-1);
           } //for
        return;
    }
}