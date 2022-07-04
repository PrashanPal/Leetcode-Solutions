class Solution {
    //p2
    //done by me
    //it is optimized not bruteforce: so here i calcute late product of number except 0
    //time==O(n) space =O(1)
    public int[] productExceptSelf(int[] nums) {
        int p=1;//to store product of all the numbers except 0
        int c=0;//to count no. of 0s
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                p=p*nums[i];
            }//if
            else c++;
        }//for
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0&&c>0){
                nums[i]=0;
            }
             else if(nums[i]!=0&&c==0){
                nums[i]=p/nums[i];
            }
            else if(nums[i]==0&&c==1){
                nums[i]=p;
            }
             else if(nums[i]==0&&c>1){
                nums[i]=0;
            }//else if
        }//for
        return nums;
    }
}