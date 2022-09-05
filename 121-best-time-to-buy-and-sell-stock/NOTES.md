//approach1: using a stack o(n) time and o(n) space
//approach2: creating an array which contains next greatest element form the rigth  o(n) time and o(n) space
my approache:**** needs a stack****
another method: **more efficient then me**
class Solution {
public int maxProfit(int[] prices) {
int maxProf = 0, j = 0;
for (int i = 1; i < prices.length; i ++){
int compare = prices[i] - prices[j];
if(compare > maxProf){
maxProf = compare;
}
if(prices[i] < prices[j])
j = i;
}
return maxProf;
}
}