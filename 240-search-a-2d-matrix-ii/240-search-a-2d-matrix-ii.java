class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int k=-1;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target&&matrix[i][matrix[0].length-1]>=target){
                k=bs(i,matrix[0].length,matrix,target);
                if(k!=-1) return true;
            }//if
        }//for
        return false;
    }//main
    public int bs(int i,int n,int[][] a,int t){
        int s=0,e=n-1;
        int m=-1;
        while(s<=e){
            m=(s+e)/2;
            if(a[i][m]==t) return m;
            else if(t<a[i][m]) e=m-1;
            else if(t>a[i][m]) s=m+1;
        }//while
        return -1;
    }
}