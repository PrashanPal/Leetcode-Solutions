class Solution {
    //p2,n2-93
    //O(nlogn) bcz we use sorting
    //0(n) space complexity
    //to understand it more clearly ,1st you have to chech wiggle sort 1
    //NOTE: since elements may repeat any no. of times so, test case is given in such a way that ,there must exist a answer you dont have to worry about it
    //i.e an element not repeat more than half of array length ,then an answer exist
    //approach: 1st we sort ,the we have 2 pointer at fornt and end i.e. i and j ,then we fill the answer array in the cyclic iteration of i;
    public void wiggleSort(int[] nums) {
         Arrays.sort(nums);
    int[] res = new int[nums.length];
    int j = nums.length - 1;
    int index = 1;
    while (index < nums.length) //ie here we fill all the odd indexes of array by the elements in 2nd half of the array
    {
      res[index] = nums[j--];
      index += 2; 
    }//while
    index = 0;
    while (index < nums.length)//since in the begining of this while loop ,j pointer is at the middle of the array
                       //ie,here we fill all the even idexes of array by the elements in the 1st half of the array
    { 
        res[index] = nums[j--];
      index += 2; 
    }//while
    for (int i = 0; i < res.length; i++)
    {
      nums[i] = res[i];
    }//for
    }//method
}