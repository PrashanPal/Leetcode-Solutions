class Solution {
    //n2-101
    //approach--> 1st do transpose ,then reverse each row of mattrix
    //time--n ,space --inplace
    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
     }//for
        }//for
      //for reversing each row
        for(int i=0;i<matrix.length;i++){
            int a=0,b=matrix.length-1;
            while(a<b){
                 int t=matrix[i][a];
                matrix[i][a]=matrix[i][b];
                matrix[i][b]=t;
                a++;
                b--;
            }//for
        }//for
    }
}