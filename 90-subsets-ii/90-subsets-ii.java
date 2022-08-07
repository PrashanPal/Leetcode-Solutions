class Solution {
    //striver
    //this method is the best method
    public List<List<Integer>> subsetsWithDup(int[] nums) {
           List<List<Integer>> lr=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        // lr.add(new ArrayList<>(l));//addition of empty list
        h(lr,l,nums,0);
        return lr;
    }
    public static void h(List<List<Integer>> lr, List<Integer> l, int[] a, int j) {
		// if(j==a.length) {
			lr.add(new ArrayList<>(l));
			// return;
		// }
		for(int i=j;i<a.length;i++) {
        // if(i>j&&a[i]==a[i-1]&&a[i-1]==-15)//this single line is very power full in removing duplicacy and combination handelling
            if(i>j&&a[i]==a[i-1])//this single line is very power full in removing duplicacy and combination handelling
                continue;
          //  int c=a[i];
            //a[i]=-15;
            l.add(a[i]);
			h(lr,l, a,i+1);
			l.remove(l.size()-1);
           // a[i]=c;
		}//for
        // if(l.size()>0)//to avoid reperttion of empty space
        //     lr.add(new ArrayList<>(l));//very important
	} // h
}//class
    