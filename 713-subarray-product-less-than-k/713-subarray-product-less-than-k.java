class Solution {
    //TOOL 
    //n2 -95
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         if(k<=1){
            return 0;
        }
        int prod=1;
        int left=0;
        int right=0;
        int res=0;
        while(right<nums.length){
            prod=prod*nums[right];
            while(prod>=k){
                prod=prod/nums[left];
                left++;
            }
            res=res+right-left+1;//this is the main soule of whole code ,which counts all the                                          permutation 
            right++;
        }
        return res;
    }//method
}//class