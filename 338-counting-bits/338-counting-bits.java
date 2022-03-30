class Solution {
    public int[] countBits(int n) {
       int a[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            int c=0,j=i;
            while(j!=0){
                c=c+(j&1);
                j=j>>>1;
            }
            a[i]=c;
        }
        return a;
    }
}