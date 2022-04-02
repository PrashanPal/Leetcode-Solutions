class Solution {
    public int[] singleNumber(int[] nums) {
        int x=0;
        for(int i:nums){
            x^=i;
        }
        int m=x&(-x);
        int a=0;
         for(int i:nums){
             if((i&m)==0){
                a^=i; 
             }
           
        }
        int b=0;
         for(int i:nums){
             if((i&m)!=0){
               b^=i;  
             }
        }
        int c[]=new int[2];
        c[0]=a;
        c[1]=b;
        return c;
    }
}