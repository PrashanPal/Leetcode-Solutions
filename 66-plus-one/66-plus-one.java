class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int t=digits[n-1];
        if(t<9){
         digits[n-1]=t+1;
            return digits;
        }
        else{
            int l=n-1,i=0;
            while(l>=0&&digits[l]==9){
                i++;
                l--;
            }
            if(i==n){
                int a[]=new int[i+1];
                a[0]=1;
                for(int j=1;j<i+1;j++){
                    a[j]=0;
                }
                return a;
            }
            else{
                digits[n-i-1]=digits[n-i-1]+1;
                for(int j=n-i;j<n;j++){
                    digits[j]=0;
                }
            }
           return digits; 
        }
    }
}