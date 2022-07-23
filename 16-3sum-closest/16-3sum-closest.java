class Solution {
    //by me
    public int threeSumClosest(int[] nums, int target) {
        int max=Integer.MAX_VALUE;
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
           int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) return sum;
                if(Math.abs(sum-target)<max){
                    max=Math.abs(sum-target);
                    c=sum;
                }//if
                if(sum<target)
                j++;
                else if(sum>target)
                    k--;
            }//while
        }//for
        return c;
    }
}