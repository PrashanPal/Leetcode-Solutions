**NOTE**=while doing binary operatortions on integers in java you dont need to convert them in binary numbers ,actually it happens automatically when you use binary operator
**by me**==public class Solution {
// you need to treat n as an unsigned value
public int hammingWeight(int n) {
String s=Integer.toBinaryString(n);
int c=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='1'){
c++;
}
}
return c;
}
}
**true solution**
​
**1**--public static int hammingWeight(int n) {
int c = 0;
while (n != 0) {
c += (n & 1);
n >>>= 1;//it do right shift in n by 1 and assisgn it to n
// .i.e==> n=n>>>1;
}
return c;
}
​
​
**** 2****-- public class Solution {
​
public int hammingWeight(int n) {
int count = 0;
while(n != 0){
n = n & (n - 1);
count++;
}
return count;
}
}
​
​