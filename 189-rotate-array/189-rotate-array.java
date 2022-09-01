class Solution {//450
    //aptimzed approach: 1st reverse the entire array ,then reverse elements form 0 to k-1 and then form k to n-1 ,here time complexity is o(n);
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
        //step1: reverse the whole array from 0 to n-1
        int i=0,j=nums.length-1;
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }//while
        // //step2: reverse the whole array from 0 to k-1
         i=0;
         j=k-1;
         while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }//while
         //step3: reverse the whole array from k to n-1
         i=k;
         j=nums.length-1;
         while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }//while
    }
}