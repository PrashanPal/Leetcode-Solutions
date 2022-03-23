class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0;
        int m=0;
        for(i=0;i<nums.length;i++){
            int s=0;
            j=i;
            while(j<nums.length&&nums[j]==1){
                s++;
                j++;
            }
            m=Math.max(m,s);
            i=j;
        }
        return m;
    }
}