class Solution {//simple approach 
    //in each loop--reduce all the non zero digits in string by 1,
    //run loop untill all the digits in string becomes 0;
    //i.e. no. of times loop run is your answer
    //i.e  the maximum digit availabe in string
    //any ans will never greater then 1
    public int minPartitions(String n) {
        int m=0;
        for(int i=0;i<n.length();i++){
            int t=n.charAt(i)-'0';
            m=Math.max(t,m);
        }
        return m;
    }
}