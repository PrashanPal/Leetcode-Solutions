class Solution {//important concept
    //n2-101
    public boolean divideArray(int[] nums) {
        int temp = 0;
       int var = 0;
        for(int i=0;i<nums.length;i++){
            temp ^= nums[i];
            var ^= -nums[i];// can you explain why we take another varible with zor of -ve element
        }
        return temp == 0 && var == 0;
    }
}