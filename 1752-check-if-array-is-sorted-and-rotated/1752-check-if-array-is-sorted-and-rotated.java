class Solution {
    //approch: count the point of divergence int array
    // ex: if(a[i]>a[i+1])--> count++
    public boolean check(int[] nums) {
        if(nums.length==1) return true;
        int f=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) f++;
        }//for this for loop is for calculating the total points of divergence in an array
        if(f==0) return true;
        if(f==1&&nums[nums.length-1]<=nums[0]) return true;
        return false;
    }
}