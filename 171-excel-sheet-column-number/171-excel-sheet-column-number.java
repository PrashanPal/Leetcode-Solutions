class Solution {
    //approch: let 3 be the length of string then : 26^2*a0 + 26^1*a1 + 26^0*a2
    //let 2 be the length of string then : 26^1*a0 + 26^0*a1
    //let 1 be the length of string then : 26^0*a0
    public int titleToNumber(String columnTitle) {
        int sum=0;
        int t=columnTitle.length()-1;
        for(int i=0;i<=t;i++){
            int j=columnTitle.charAt(i)-'A'+1;
            int p=(int)Math.pow(26,t-i);
            sum=sum+p*j;
        }//for
        return sum;
    }
}