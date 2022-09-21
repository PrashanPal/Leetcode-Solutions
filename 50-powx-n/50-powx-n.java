class Solution {
    //s450-->bitmanipulation hard --> see video of striver for easy understanding
    public double myPow(double x, int n) {
        double a=1.0;
        long nn=n;
        if(nn<0) nn=-1*nn;//this line is very important ,bcz it handle case of -ve exponential
        while(nn>0){
            if(nn%2==1){
                a=a*x;
                nn=nn-1;
            }
            else {
                x=x*x;
                nn=nn/2;
        }//else
        }//while
            if(n<0){
                double res=1/a;
                return res;
            }//if
            return a;
    }
}