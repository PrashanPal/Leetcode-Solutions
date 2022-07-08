class Solution {
//pep2
//ex [4,4,4]=64 i.e repetition is allowed.
//brute force approach: to sort the array and return product of last 3 elements--->nlogn time complexty
//by me
//optimize approach: find larget and 2nd larget in one loop ,then find 3rd largest in other loop--->O(n)+O(n)
public int maximumProduct(int[] nums) {
//ex--[-40,-10,-2,500,2]
int c=0;//it will contain count of +ve no. selected
for( int i=0;i<nums.length;i++){
if(nums[i]>=0)  c++;
}
//if after 1st loop, c==0 then all no.are -ve and you cant do anythind
//if c==1,then 2nd and 3rd largest no. must also be -ve i,e you two -ve numbers out of 3. so overall result is positive
//if c==2,then 3rd no must be -ve
int m1=0;//index of max number
int m2=0;//index of 2nd max number
int i=0,j=nums.length- 1;
int p=1;//to store product
while(i<j){//at the end of this while loop you will get indexs of 1st and 2nd largest no.
if(nums[i]<=nums[j]){
m1=j;
m2=i;
i++;
}//if
else if(nums[i]>nums[j]){
m1=i;
m2=j;
j--;
}//else
}//while
p=nums[m1]*nums[m2];
if(p<=0)
nums[m1]=Integer.MIN_VALUE;
nums[m2]=Integer.MIN_VALUE;
int m=Integer.MIN_VALUE;
for(int k=0;k<nums.length;k++){
m=Math.max(m,nums[k]);
}//for
return p*m;
}
}