class KthLargest {
 
  ArrayList<Integer> a=new ArrayList<>();  
    int m=-1;
    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        for(int i:nums){
            a.add(i);
        }//for
        m=k;
    }//kth
    
    public int add(int val) {
        int p=0;
        int i=0,j=a.size()-1;
        while(i<=j){
            if(val<=a.get(i)){
                p=1;
                a.add(i,val);
                break;
            }//if
            if(val>a.get(i)){
                i++;
            }//if
        }//while
        if(p==0){
            a.add(val);
        }//if
        //KthLargest obj = new KthLargest(k, nums); 
        return a.get(a.size()-m);
    }//add
    
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */