class Solution {
    //this method is recursion based and used concept of picked and not picked
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lr=new ArrayList<>();
      //  Arrays.sort(candidates);// using it is not necessay and will dont affect your solution
        h(lr,candidates,new ArrayList<>(),target,0);
        return lr;
    }
    //time :2^t*k i.e(for taget t and smallest possible element in array is 1 ,then 1*t=t that means for each element we can pic and not pic for t times) and let k= avg length of l list because each time we have to add its each element to lr
    //space : x*y (x= no. of total combinations and y= avg length of each combination)
    public void h(List<List<Integer>> lr,int[] a,List<Integer> l,int t,int j){
        if(t==0&&j<=a.length){
            lr.add(new ArrayList<>(l));
            return;
        }
        else if(t<0||j>=a.length)
            return;
         //to pick it
        l.add(a[j]);
        h(lr,a,l,t-a[j],j);
        //to not pick it
        if(l.size()>0) l.remove(l.size()-1);
        h(lr,a,l,t,j+1);
        
        return;//default
    }
}