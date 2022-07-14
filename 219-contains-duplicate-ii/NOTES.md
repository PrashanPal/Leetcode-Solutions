[99,99]
2
[2,2]
3
[99,99]
0
​
Explanation: It iterates over the array using a sliding window. The front of the window is at i, the rear of the window is k steps back. The elements within that window are maintained using a Set. While adding new element to the set, if add() returns false, it means the element already exists in the set. At that point, we return true. If the control reaches out of for loop, it means that inner return true never executed, meaning no such duplicate element was found.
​
public boolean containsNearbyDuplicate(int[] nums, int k) {
Set<Integer> set = new HashSet<Integer>();
for(int i = 0; i < nums.length; i++){
if(i > k) set.remove(nums[i-k-1]); //remove element if its distance to nums[i] is not lesser than k
if(!set.add(nums[i])) return true; //because all still existed elements is closer than k distance to the num[i], therefore if the add() return false, it means there's a same value element already existed within the distance k, therefore return true.
}
return false;
}