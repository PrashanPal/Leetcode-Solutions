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