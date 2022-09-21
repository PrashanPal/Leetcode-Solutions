class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int r[]=new int[nums.length];
        int k=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            s+=nums[i];
        }//for
        for(int e[]:queries){
            int i=e[1];//index to be chaged
            if(nums[i]%2==0){
                s=s-nums[i];
            }//if
            nums[i]=e[0]+nums[i];
            if(nums[i]%2==0){
                s=s+nums[i];
            }
            r[k]=s;
            k++;
        }//for
        return r;
    }
}