class Solution {
    //p2
    //approach0: take an extra array of sixe n
    //optimized approach1:
//     factor of 6: 1,2,3,6
// factor of 7: 1,7
// factor of 9: 1,3,9

// so all number have even number of factors except square number(e.g: factor of 9:1,3,9).
// square number must turn on because of odd number of factors(9: turn on at 1st, off at 3rd, on at 9th)
// other number must turn off(6: turn on at 1st, off at 2nd, on at 3rd, off at 6th)
// so we only need to compute the number of square number less equal than n
    
    
    //example for n=10 ,all squares are 1,4,9

    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
        //So that's all we need to know to hack this problem now. But how to get the amount of squares that are less than n, quite simple. Sqrt(n) is the answer, since all square numbers that is less than n will be 1, 4, 9 ... n and their corresponding square roots will be 1, 2, 3,... sqrt(n).

// Space cost O(1)
// Time cost O(1)
    }
}