**//method 1: brutforce method --o(n^2)---> but this result in TLE
//This is Naive method**
public int maxArea(int[] height) {
int m=0;
for(int i=0;i<height.length-1;i++){
for(int j=i+1;j<height.length;j++){
int c=0;
int t=Math.min(height[i],height[j]);
c=c+t*(j-i);
m=Math.max(c,m);
}//for
}//for
return m;
}
//method 2: this is good