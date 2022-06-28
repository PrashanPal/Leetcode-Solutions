class Solution {
    public int[] nextGreaterElements(int[] nums) {
        boolean b[]=new boolean[nums.length];
        int a[]=new int[nums.length];//for storing result, because of cyclic nature of nums[], you can't                                      use and update the same array ,it will create error
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j%nums.length!=i){//this the main trick in this question for cyclic rotation
                int t=j%nums.length;
                if(nums[t]>nums[i]){
                    a[i]=nums[t];
                    b[i]=true;
                    break;
                }
                j++;
            }//while
            if(b[i]==false) a[i]=-1;
        }//for
        return a;
    }
}