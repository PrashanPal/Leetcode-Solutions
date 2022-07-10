class Solution {
    //method 1: sort the array and then take sum of all the elements at even indexes from 0 to n-1;
    //this takes nlogn time
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=0,i=0;
        while(i<nums.length){
            s=s+nums[i];
            i+=2;
        }
        return s;
    }
}