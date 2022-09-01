class Solution {//450
    //aptimzed approach: 1st reverse the entire array ,then reverse elements form 0 to k-1 and then form k to n-1 ,here time complexity is o(n);
   
    public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }//while
}//reverse
}//class