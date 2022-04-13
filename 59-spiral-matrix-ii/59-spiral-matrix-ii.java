class Solution {
    public int[][] generateMatrix(int n) {
        int a[][]=new int[n][n];
        int l=0,p=1;
        while(p<=n*n){
            for(int i=l;i<=n-l-1;i++){
                if(p<=n*n)
                a[l][i]=p;
                p++;
            }
            for(int j=l+1;j<=n-l-2;j++){
                if(p<=n*n)
                a[j][n-l-1]=p;
                p++;
            }
            for(int i=n-l-1;i>=l;i--){
                if(p<=n*n)
                a[n-l-1][i]=p;
                p++;
            }
            for(int j=n-l-2;j>=l+1;j--){
                if(p<=n*n)
                a[j][l]=p;
                p++;
            }
            l++;
        }//while
        return a;
    }
}