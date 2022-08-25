class Solution {
    //brute force approach:O(n^2)
    //this is optimized-->from video in pepcoding
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int cprod=1;
        for(int i=0;i<nums.length;i++){//for left side
            cprod*=nums[i];
            ans=Math.max(ans,cprod);
            if(cprod==0){
                cprod=1;
            }//if
        }//for
        
        cprod=1;
        for(int i=nums.length-1;i>=0;i--){//for right side
            cprod*=nums[i];
            ans=Math.max(ans,cprod);
            if(cprod==0){
                cprod=1;
            }//if
        }//for
        
        return ans;
    }
}