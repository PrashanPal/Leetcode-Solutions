class Solution {
    //n2--107
    //p2
    public String multiply(String num1, String num2) {
        	if ("0".equals(num1) || "0".equals(num2))
			return "0";
        int c=0;//for storing carry generated
        int k=0;
    // for help in accurate addition//main logic :if two numbers are multiplied then maximum possible length of resultant number is ==num1.length+num2.length
        int res[]=new int[num1.length()+num2.length()];// here we dont need to maintain two arrays for addition and and multiplication ,we jsut do it using one array only
        int r=res.length-1;//helps for iterating in res
        for(int i=num1.length()-1;i>=0;i--){
            c=0;
            r=res.length-1;
            for(int j=num2.length()-1;j>=0;j--){
                int t=c+res[r-k]+(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int d=t%10;
                c=t/10;
                res[r-k]=d;
                r--;
            }//for
            if(c>0){
                 int t=c+res[r-k];
                int d=t%10;
                c=t/10;
                res[r-k]=d;
            }
            k++;//this step is very crutial
        }//for
            int i=0;//for counting prefix zeros in our res[] because dont need prefix zeros
        while(res[i]==0){
            i++;
        }//
        StringBuilder sb=new StringBuilder("");
        while(i<res.length){
            sb.append( Integer.toString(res[i]));
            i++;
        }//while
        String ans=sb.toString();
        return ans; 
    }
}