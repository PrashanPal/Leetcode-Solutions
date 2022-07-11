class Solution {
    //n2-96
    //for detail move to n2-96
    //standard appoach ,so remember it
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);//this is an important step ,if remainder is 0 ,it means it is also a subarray
        int c=0;
        int s=0;//it avoids need of taking an extra prefixsum array ,because you also sum of prefix while doing iteration
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            int d=s%k;
            if(d<0) d=d+k;//important step 
            if(!h.containsKey(d)){
                h.put(d,1);
            }
           else if(h.containsKey(d)){
                c=c+h.get(d);
                h.put(d,h.get(d)+1);
            }//else if
        }//for
        return c;
    }
}