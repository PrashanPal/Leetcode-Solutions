class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        StringBuilder sb=new StringBuilder("");
        while(i>=0&&j>=0){
            int t=num1.charAt(i)-'0'+num2.charAt(j)-'0'+c;
            int d=t%10;
            c=t/10;
             char m=(char)(d+'0');   
            sb.insert(0,m);
           // String s=Integer.toString(d);
           // sb.append(s);
            i--;
            j--;
        }//while
        if(i>j){
            while(i>=0){
                 int t=num1.charAt(i)-'0'+c;
            int d=t%10;
            c=t/10;
              char m=(char)(d+'0');   
            sb.insert(0,m);
           // String s=Integer.toString(d);
           // sb.append(s);
            i--;
            }
        }
        else if(i<j){
            while(j>=0){
                 int t=num2.charAt(j)-'0'+c;
            int d=t%10;
            c=t/10;
            char m=(char)(d+'0');    
            sb.insert(0,m);
         //   String s=Integer.toString(d);
         //   sb.append(s);
            j--;
            }//while
        }//else if
        if(c>0){
            char m=(char)(c+'0');    
            sb.insert(0,m); 
        }
        String str = sb.toString();
        return str;
    }
}