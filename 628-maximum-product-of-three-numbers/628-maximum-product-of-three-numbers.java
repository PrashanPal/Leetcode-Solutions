class Solution {
    //pep2
    //ex [4,4,4]=64 i.e repetition is allowed.
    //brute force approach: to sort the array and return product of last 3 elements--->nlogn time complexty
    //by me
    //optimize approach: find larget and 2nd larget in one loop ,then find 3rd largest in other loop--->O(n)+O(n)
    public int maximumProduct(int[] nums) {
       int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}