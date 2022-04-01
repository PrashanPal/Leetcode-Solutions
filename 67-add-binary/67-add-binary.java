class Solution {
    public String addBinary(String a, String b) {
        int al=a.length()-1;
         int bl=b.length()-1;
        //String r="";
        StringBuilder r=new StringBuilder("");  
        int c=0;
        while(al>=0&&bl>=0){
        int t=a.charAt(al)-'0';
            t=c+t+b.charAt(bl)-'0';
            if(t==0){
                //r="0"+r;
                r.insert(0, "0");
                c=0;
            }
            else if(t==1){
               // r="1"+r;
                 r.insert(0, "1");
                c=0;
            }
            else if(t==2){
               // r="0"+r;
                 r.insert(0, "0");
                c=1;
            }
            else if(t==3){
                //r="1"+r;
                 r.insert(0, "1");
                c=1;
            }
            al--;
            bl--;
        }//while
        if(al<0&&bl>=0){
            while(bl>=0){
                int t=c+b.charAt(bl)-'0';
                if(t==0){
              //  r="0"+r;
                     r.insert(0, "0");
                c=0;
            }
            else if(t==1){
               // r="1"+r;
                 r.insert(0, "1");
                c=0;
            }
            else if(t==2){
                //r="0"+r;
                 r.insert(0, "0");
                c=1;
            }
                bl--;
            }//while
        
        }//if
        
        if(al>=0&&bl<0){
            while(al>=0){
                int t=c+a.charAt(al)-'0';
                if(t==0){
                //r="0"+r;
                     r.insert(0, "0");
                c=0;
            }
            else if(t==1){
               // r="1"+r;
                 r.insert(0, "1");
                c=0;
            }
            else if(t==2){
                //r="0"+r;
                 r.insert(0, "0");
                c=1;
            }
                al--;
            }//while
        }//if
        if(c==1){
            //r="1"+r;
             r.insert(0, "1");
        }
        //String singleString = sb.toString();
        return r.toString();
    }
}