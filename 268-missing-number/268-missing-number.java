class Solution {
    public int missingNumber(int[] nums) {
        int  s=0;
        for(int i=1;i<=nums.length;i++)
            s+=i;
        for(int i:nums) s-=i;
        return s;
    }
}