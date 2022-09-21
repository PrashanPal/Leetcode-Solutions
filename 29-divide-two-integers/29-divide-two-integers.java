class Solution {
    public int divide(int dividend, int divisor) {
        //approach: we can use + or - for multiple times-->in this question we are addition method
        //we add these two below conditions because Math.abs(minval)>Math.abs(max.val)
         if(dividend==Integer.MIN_VALUE && divisor == -1)//intellingent move
            return Integer.MAX_VALUE;
        if(dividend==Integer.MIN_VALUE&& divisor == 1)//intellingt move
            return Integer.MIN_VALUE;
        
        long dd = Math.abs((long)dividend);//important
        long dv = Math.abs((long)divisor);//important
        long t=dv;
        if(dv>dd) return 0;         
            long count = 1;  
        while(dd-dv>0)//nice condition bro
        {
            count=count+count;
            dv+=dv; 
        }//while
        while(dd-dv<0){
            dd+=t;
            count--;
        }//while
        
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))//very important
            return (int)-count;
        return (int)count;
    }
}