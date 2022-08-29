class Solution {
    //approach : to maximum possible jums till u reached the last index
    public int jump(int[] nums) {
        int m=0;
        int c=0;
        int j=0,k=0;
        for(int i=0;i<nums.length-1;i++){
            j=nums[i];
            if(i+j>=nums.length-1) return c+1;
            k=0;
            m=0;
            while(j>0){
                if((i+j)<nums.length&&m<(j+nums[i+j])){
                    m=j+nums[i+j];
                    k=j;
                }//if
                j--;
            }//while
                c+=1;
                i=i+k;
                i=i-1;//to overcome outomatic increment of for loop
        }//for
        return c;
    }
}