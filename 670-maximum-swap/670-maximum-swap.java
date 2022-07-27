class Solution {
    //this one is good
//     Most of other solutions use a bucket to store the last occurrence of a digit and do a comparison for each digit. However, that is not efficient for case like "1000000"

// The idea is straightforward, as we can simply scan the digits backward and record the position of the largest digit when it first appears.

// Next time we scan the digits from left to right and find the first digit that is less than max to do the swap.
    public int maximumSwap(int num) {
        //n2--119
        //nice concept
        //see notes for easy understanding
         char[] digits = String.valueOf(num).toCharArray();
        int[] maxIdx = new int[digits.length];
        int maxPos = digits.length - 1;
        maxIdx[maxPos] = maxPos;
        
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] > digits[maxPos]) {
                maxPos = i;
            }
            maxIdx[i] = maxPos;
        }
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != digits[maxIdx[i]]) {
                char tmp = digits[i];
                digits[i] = digits[maxIdx[i]];
                digits[maxIdx[i]] = tmp;
                return Integer.parseInt(String.valueOf(digits));
            }
        }
        
        return num;
    }
}