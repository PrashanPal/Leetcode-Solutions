class Solution {
    public int minBitFlips(int start, int goal) {
        //s450-->bitmanipulation medium
        //approach: take xor of both the no.s and then count no. of 1s in it
        int t=start^goal;
        int count=0;//to count total no. of 1s in t
        while(t>0){
            if((t&1)==1) count++;
            t=t>>1;//right shift t by 1
        }//while
        return count;
    }
}