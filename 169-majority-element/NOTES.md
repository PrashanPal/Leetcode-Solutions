**method 1:**
public class Solution {
public int majorityElement(int[] nums) {
Arrays.sort(nums);
int len = nums.length;
return nums[len/2];
}
}
​
**method 2:**---**O(n) time O(1) space fastest solution**
public class Solution {
public int majorityElement(int[] num) {
​
int major=num[0], count = 1;
for(int i=1; i<num.length;i++){
if(count==0){
count++;
major=num[i];
}else if(major==num[i]){
count++;
}else count--;
}
return major;
}
}
​