class Solution {
    public int maxSubArray(int[] n) {
        int m=n[0];
        int s=0;
        for(int i=0;i<n.length;i++){
            s=n[i]+s;
            m=Math.max(m,s);
            if(s<0){
                s=0;
            }
        }
        return m;
    }
}