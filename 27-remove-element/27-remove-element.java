class Solution {
    //Tool: nice question ,if you want to know ,how to pointers can avoid the need of extra space
    // approach: take two pointers i and j ,if a[i]==val,then increment i only not j
    public int removeElement(int[] nums, int val) {
        int k=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                k++;
                i++;
                while(i<nums.length&&nums[i]==val){
                    k++;
                    i++;
                }//while
                if(i<nums.length)
                nums[j]=nums[i];
            }//if
            else{
                nums[j]=nums[i];
            }
            j++;
        }//for
        return nums.length-k;
    }
}