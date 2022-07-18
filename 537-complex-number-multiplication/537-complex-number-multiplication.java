class Solution {
    //by me and base on simple calculation
    public String complexNumberMultiply(String num1, String num2) {
        //in constant part "-" is same as "-" ,but in imaginary part "-" is same as "+-"
        String[] s1=num1.split("\\+");
        String a1=s1[0];
        String b1=s1[1].substring(0,s1[1].length()-1);// i.e "i" is removed here for easy calculation ,we will add it in later while delivering answer
        
          String[] s2=num2.split("\\+");
        String a2=s2[0];
         String b2=s2[1].substring(0,s2[1].length()-1);
        // for easy calculation we will converst all the strind into integer for
        int x1=Integer.parseInt(a1);  
         int y1=Integer.parseInt(b1);  
         int x2=Integer.parseInt(a2);  
         int y2=Integer.parseInt(b2);
        //now (x1+y1i)*(x2+y2i)--> int const=x1*x2-y1*y2  and img=x1*y2 + x2*y1
        int con=x1*x2-y1*y2;
        int img=x1*y2 + x2*y1;
        StringBuilder sb=new StringBuilder("");
        String p=Integer.toString(con);
        sb.append(p);
        String q=Integer.toString(img);
        if(img>=0){
             sb.append("+");
            sb.append(q);
            sb.append("i");
        }//if
        else if(img<0){
            sb.append("+");
             sb.append(q);
            sb.append("i");
        }//else if
        return sb.toString();
    }//fn
}//class