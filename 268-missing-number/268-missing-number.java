class Solution {
    //since in this question it is given that all the no. are distict and all the no. in the array is in range [0,n] and only one no. is missing ---> so here n(n-1)/2 approach will work
    // but also remember that this approach will not work if the no. is both missing and repeating
    public int missingNumber(int[] nums) {
        //using xor approach ,since no. is only missing and not repeating
        int r=0;
        for(int i=0;i<nums.length;i++){
            r=r^nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            r=r^i;
        }
        return r;
    }
}