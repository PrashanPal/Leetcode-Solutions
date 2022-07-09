class Solution {
    //p2
    //n2-95
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
        int k=nums.length-1;
        int i=0,j=nums.length-1;
        while(i<=j){
            if(Math.abs(nums[i])>=Math.abs(nums[j])){
                a[k]=nums[i]*nums[i];
                i++;
                k--;
            }//if
            else if(Math.abs(nums[i])<Math.abs(nums[j])){
                a[k]=nums[j]*nums[j];
                j--;
                k--;
        }//else if
        }//while            
        return a;
    }
}