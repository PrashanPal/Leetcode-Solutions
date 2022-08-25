class Solution {
    //approch: take two sets one for storing rows and other storing columns that contains 0 element
    //O(m + n) space
    public void setZeroes(int[][] matrix) {
     Set<Integer> r=new HashSet<>();
         Set<Integer> c=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }//if
            }//for
        }//for
        for(int e:r){
            for(int j=0;j<matrix[0].length;j++){
                matrix[e][j]=0;
            }
        }
         for(int e:c){
            for(int i=0;i<matrix.length;i++){
                matrix[i][e]=0;
            }
        }
    }
}