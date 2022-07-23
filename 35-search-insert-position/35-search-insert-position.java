class Solution {
    //this is done by me 
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int m=0;
        while(s<e){
             m=(s+e)/2;
            if(nums[m]==target) return m;
            else if(target>nums[m]){
                s=m+1;
            }
           else if(target<nums[m]){
                e=m-1;
            }
        }//while
         if(e<0) return 0; 
       else if(nums[e]<target) return e+1;
        return e;
    }
}