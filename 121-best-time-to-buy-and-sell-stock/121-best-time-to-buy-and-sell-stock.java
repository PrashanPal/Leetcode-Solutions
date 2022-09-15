class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        int t=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<t){
                t=prices[i];
            }//if
            else if(prices[i]>t){
                m=Math.max(m,prices[i]-t);
            }//else if
        }//for
        return m;
    }
}