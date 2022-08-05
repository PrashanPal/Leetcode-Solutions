class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> lr=new ArrayList<>();
      Arrays.sort(candidates);// using it is very  necessay bcz it helps in using each element only once in a combination and also full filling the condition that each combination should be unique
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
               if(i>0&&a[i]==a[i-1]&&a[i]>0)//very important condition
                   continue;
                   l.add(a[i]);
               int c=a[i];//obsrve variable c--it is updated in each recursive call,and while tracking back you got the value in c-- with respect to its corresponding recursive call 
               a[i]=0;
               //to not pick
                   h(lr,a,l,t-c,i+1);// i + 1 because we don't have to reuse same elements
                   l.remove(l.size()-1);
               a[i]=c;
           } //for
        return;
    }   
    
}