class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int a[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m||j<n){
            if(i<m&&j<n&&n1[i]<=n2[j]){
                a[k]=n1[i];
                k++;
                i++;
            }
            else if(i<m&&j<n&&n1[i]>n2[j]){
                a[k]=n2[j];
                k++;
                j++;
            }
            else if(i==m&&j<n){
                a[k]=n2[j];
                k++;
                j++;
            }
            else if(i<m&&j==n){
                a[k]=n1[i];
                k++;
                i++;
            }
        }//while
        for(int p=0;p<n+m;p++){
            n1[p]=a[p];
        }
    }
}