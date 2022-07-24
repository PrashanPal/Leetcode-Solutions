class Solution {
    //approach1:bruteforce solution
    //take an extra array of size n,and place all the positive elements in it one by one
    public int[] rearrangeArray(int[] nums) {
        int a[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                a[k]=nums[i];
            k+=2;
            }//k
        }//for
        k=1;
         for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                a[k]=nums[i];
            k+=2;
            }//k
        }//for
        return a;
    }
}