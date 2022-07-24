class Solution {
    //its really an important and wonder full solution
   //n2-->109 
    public int findMaxLength(int[] nums) {
      int Sum = 0, max = 0;
   HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++) {
        Sum += nums[i]== 0 ? -1 : 1;//important trick
        if(Sum == 0) {
            max = i+1;
        } else if(map.containsKey(Sum)) {
            max = Math.max(max, i-map.get(Sum));//really important line i.e. if sum repeats then it means that the sum elements between these two indices is 0,which indicates that is have equal no. of 0 and 1 between these two indices
        } else {
            map.put(Sum, i);
        }
    }
    return max;
    }
}