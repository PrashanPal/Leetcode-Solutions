[73,55,36,5,55,14,9,7,72,52]
32
69
[16,69,88,85,79,87,37,33,39,34]
55
57
https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/discuss/117595/Short-Java-O(n)-Solution
**o(n) solution**      yrr yeh toh mere waale se bahut hi easy h
class Solution {
public int numSubarrayBoundedMax(int[] A, int L, int R) {
int j=0,count=0,res=0;
for(int i=0;i<A.length;i++){
if(A[i]>=L && A[i]<=R){
res+=i-j+1;count=i-j+1;
}
else if(A[i]<L){
res+=count;
}
else{
j=i+1;
count=0;
}
}
return res;
}
}