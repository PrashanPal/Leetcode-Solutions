class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> s = new Stack<>();
        s.push(prices[0]);
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<=s.peek()){
                s.pop();
                s.push(prices[i]);
            }
            else{
                p=Math.max(p,prices[i]-s.peek());
            }
        }//for
        return p;
    }
}