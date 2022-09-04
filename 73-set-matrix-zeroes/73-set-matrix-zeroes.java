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
        for(int e:r){//r-->rows which contains 0
            for(int j=0;j<matrix[0].length;j++){//for marking 0 in all the columns of that row
                matrix[e][j]=0;
            }
        }
         for(int e:c){//c-->columns which contans 0
            for(int i=0;i<matrix.length;i++){//for marking 0 in all the rows of that column
                matrix[i][e]=0;
            }
        }
    }
}