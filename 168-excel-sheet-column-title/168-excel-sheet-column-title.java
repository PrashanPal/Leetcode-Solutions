class Solution {
    //Important TOOL
    //approach: ZY=26^1*26 + 26^0*25
    //AA: 26^1*1 + 26^0*1
    //AB: 26^1*1 + 26^0*B
    //CED: 26^2*3 + 26^1*5 + 26^0*4
    
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        int d=0;
        StringBuilder sb=new StringBuilder("");
        while(n>0){
            d=n%26;
            if(d==0){
                n=n-26;
            }
            else{
            n=n-d;
            }
            n=n/26;
            if(d==0)//last character is Z
                sb.insert(0,String.valueOf('Z'));
            else
                sb.insert(0,String.valueOf((char)('A'+d-1)));
        }//while
        return sb.toString();
    }
}