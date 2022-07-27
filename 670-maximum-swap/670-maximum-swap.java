class Solution {
    //this is method2
    //n2--118
    //it is more optimized then method 1
    //it is based on bucket approach, we have 10 buckets from 0-9 ,and each bucket contains last digit of occurance of that digit in the givien num
    //ex 998742393 
    // since here no. is of at most 8 digits ,so method2 is more complexing then method 1 here,but still i want to do it because method 2 is helpful if instead of number we have givien a string of length 10000 then the space complexity in method1 is o(n) and in method2 is o(10) i.e constant will the time complexity of both the methods are same i.e o(n)
    public int maximumSwap(int num) {
        // take array for creating buckets
        int buc[]=new int[10];
        //converting into string
        String s=Integer.toString(num);
        //converting string into char array for each execution
        char[] ch=s.toCharArray(); 
        for(int i=0;i<ch.length;i++){
            int t=ch[i]-'0';//i.e digit at ith index
            buc[t]=i;//this bucket value is replaced by its last occurance
        }//now our buckets are filled completely
        
        // find the digits to be swaped and swap them
        for(int i=0;i<ch.length;i++){
             int t=ch[i]-'0';//i.e digit at ith index
            //exmple for digit 6 we can check the buckets of 9,8,7
            int k=9;
            while(k-t>0){//i.e for 9,8,7
                if(buc[k]>i){
                    //do swap pth and ith index digits
                    int p=buc[k];//i.e last index of digit k
                    char c=ch[p];
                    ch[p]=ch[i];
                    ch[i]=c;
                      String str = new String(ch);  
        return Integer.parseInt(str); 
                }//if
                else {
                    k--;
                }//else
            }//while
        }//for
        // now convert chararray into string and that string into integer and return
        String str = new String(ch);  
        return Integer.parseInt(str);  
    }
}