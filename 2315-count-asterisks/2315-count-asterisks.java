class Solution {
    //"*||||**||*||**|**||*|||**"
    public int countAsterisks(String s) {
        int n=s.length();
        int c=0;
        int i=0,j=0;
        for(i=0;i<n;i++){
            if(s.charAt(i)=='*')
                c++;
            else if(s.charAt(i)=='|'){
            j=i+1;
                int t=0;
            while(j<n&&s.charAt(j)!='|'){
                j++;  
                 if(s.charAt(i)=='*')
                t++;
            }//while
            if(j<n){//it means s.charAt(i)=='|'
                t=0;
                i=j;
            }//if
            else if(j>=n)
                c=c+t;
            }//if
        }//for
        return c;
    }
}