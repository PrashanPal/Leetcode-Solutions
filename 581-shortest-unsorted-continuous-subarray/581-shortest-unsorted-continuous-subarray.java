class Solution {
    //pep2
    //nice solution
    public int findUnsortedSubarray(int[] nums) {
           int end = -1;//to store end point of subarray
      int max = nums[0];//find the maximum from left of i
      
      for(int i=1; i<nums.length; i++)
      {
          if(max > nums[i])
          {
              end =i;//update end by all the indexe which are less then max
          }
          else
          {
              max = nums[i];//to find the max from left side of i
          }
      }
      
      int st =0;//to store start point of subarray
      int min = nums[nums.length -1];
      
      for(int i=nums.length -2; i>=0; i--)
      {
          if(nums[i] > min)
          {
              st =i;//update start by all the index which are greater then min
          }
          else
          {
              min = nums[i];// it stores min
          }
      }
      
      return end - st + 1;
			
    }
}