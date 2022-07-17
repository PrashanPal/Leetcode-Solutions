https://leetcode.com/problems/knight-probability-in-chessboard/discuss/162722/Simple-Java-DP-solution-with-explanation
​
class Solution {
//my way of solving but it is not good
static int a[][]={{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2}};
static int out[]={0};
static int in[]={0};
public double knightProbability(int n, int k, int row, int column) {
out[0]=0;
in[0]=0;
h(n,k,row,column);
Double d= new Double(out[0]);//outside board
Double b= new Double(in[0]);//inside board
System.out.println(d);
System.out.println(b);
Double res=(b/(d+b));
return res;
}//knight
public int h(int n,int k,int r,int c){
if(k==0)//k<0 means when knight stops
if(r>=0&&r<n&&c>=0&&c<n){
in[0]+=1;
return 0;
}