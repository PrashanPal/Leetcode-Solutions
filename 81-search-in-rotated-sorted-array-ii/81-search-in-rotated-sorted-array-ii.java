class Solution {
    public boolean search(int[] nums, int target) {
        int r=nums.length-1;
        while(r>=0&&nums[r]>=target){
            if(nums[r]==target){
                return true;
            }
            r--;
        }
        int l=0;
        while(l<nums.length&&nums[l]<=target){
              if(nums[l]==target){
                return true;
            }
            l++;
        }
        return false;
    }
}