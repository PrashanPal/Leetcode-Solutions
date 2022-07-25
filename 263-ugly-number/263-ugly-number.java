class Solution {
    //this is great approach bro
    public boolean isUgly(int num) {
       if (num == 0) return false;
        if (num == 1) return true;

        while (num != 1) {
            if (num % 2 == 0) num /= 2;
            else if (num % 3 == 0) num /= 3;
            else if (num % 5 == 0) num /= 5;
            else return false;//this is the case when num>1 and it is neither divisible by 2,3 or 5 ,it means its a prime factor other then 2,3 and 5
        }
        return true;
    }
}