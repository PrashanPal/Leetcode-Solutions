Also using Hash Set to solve this problem, but I used size() to compared the size of set is equal to the length of the array or not.
​
public  boolean containsDuplicate(int[] nums) {
HashSet h = new HashSet();
for (int i=0;i<nums.length;i++){
h.add(nums[i]);
}
return (h.size()!=nums.length)? true:false;
}
​