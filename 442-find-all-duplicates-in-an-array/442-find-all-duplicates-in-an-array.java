class Solution {
    //p2
    //n2-->119
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> res = new ArrayList<>();
 
    for (int i = 0; i < nums.length; i++) {
      int indx = Math.abs(nums[i]) - 1;
      int val = nums[indx];
 
      if (val < 0) {
        res.add(indx + 1);
      } else {
        nums[indx] *= -1;
      }
    }
    return res;
    }
}