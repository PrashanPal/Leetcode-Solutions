class Solution {
    //approach:i will use an external array of size n 
    //time:n ,space: n
    public int[] pivotArray(int[] nums, int pivot) {
        int a[]=new int[nums.length];
        int k=0;
        int c=0;//this is to count all the no. that are equal to pivot
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                a[k]=nums[i];
                k++;
            }
            else if(nums[i]==pivot){
                c++;
            }
        }
        while(c>0&&k<nums.length){
            a[k]=pivot;
            k++;
            c--;
        }//while
         for(int i=0;i<nums.length;i++){
            if(k<nums.length&&nums[i]>pivot){
                a[k]=nums[i];
                k++;
            }
        }//for
        return a;
    }
}