class Solution {
    //1-Approach: using hashmap ,but can also done without it
   
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        if(h.containsKey(nums[i])){
            return true;
        }
        else{
            h.put(nums[i],1);
        }
   
    }
             return false;
}
}