class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int i=0;i<32;i++){
            int s=0;
            for(int j:nums){
                if(((j>>i)&1)==1){
                    s++;
                    s%=3;
                }//if
            }//f0r
            if(s!=0){
              a=a|s<<i;  
            }
        }
        return a;
    }
}