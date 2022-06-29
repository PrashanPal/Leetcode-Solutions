class Solution {
    //method 2:pep
    //In this approach will use two pointers i and j where i =0 and j = arr.length - 1. So the water will be      ( j - i ) * min(ht[i], ht[j]). Now we need to decide when i will increase and when j will decrease to        find the next container’s water.
    
    // If we increment in i then there are two cases: one is maybe the height increases then the chances of       most water will increase , second it may be height decrease then the container will not contain most        water. If we decrement in j then there are two cases: one is maybe the height increases then the chances      of    containing most water will increase , second it may be height decrease then the container will not        contain most water. Now the cases are: If the height at j index is greater than the height at i index      than we need to increase the index i by one so that the possibility of getting most water will increase      and same for height at j is smaller than height at i this time we need to change j by decreasing it by 1.
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        
        int mostWater = 0;
        while(i < j) {
            int base = j - i;
            int h1 = height[i];
            int h2 = height[j];
            int water = base * Math.min(h1, h2);;
            if(water > mostWater) {
                mostWater = water;
            }
            if(h1 == h2) {
                i++;
                j--;
            }
            else if(h1 > h2) {
                j--;
            } 
            else {
                i++;
            }
        }
        
        return mostWater;
    }
}