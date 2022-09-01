1:Sum of n number: n(n+1)/2.
​
public class Solution {
public int missingNumber(int[] nums) {
int sum=0;
int len=nums.length+1;
for(int n:nums)
sum+=n;
return ((len*(len-1)) /2-sum);
}
}
​
2:The basic idea is to use XOR operation. We all know that a^b^b =a, which means two xor operations with the same number will eliminate the number and reveal the original number.
In this solution, I apply XOR operation to both the index and value of the array. In a complete array with no missing numbers, the index and value should be perfectly corresponding( nums[index] = index), so in a missing array, what left finally is the missing number.
​
public int missingNumber(int[] nums) {
​
int xor = 0, i = 0;
for (i = 0; i < nums.length; i++) {
xor = xor ^ i ^ nums[i];
}
​
return xor ^ i;
}
​
3:public int missingNumber(int[] nums) {
​
int actual = 0;
int should = 0;
for(int i=0; i<nums.length; i++){
actual = actual+nums[i];
should = should+i;
}
should = should+nums.length;
return should-actual;
}