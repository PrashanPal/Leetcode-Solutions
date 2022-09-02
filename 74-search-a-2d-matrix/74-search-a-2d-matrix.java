class Solution {
//     Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        //find the appropriate row to search the target
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target&&matrix[i][m-1]>=target){
                //now apply binary search in this array to search the target
                int s=0;
                int e=m-1;
                int mid=0;
                while(s<=e){
                    mid=(s+e)/2;
                if(target==matrix[i][mid]) return true;
                    else if(target<matrix[i][mid]){
                        e=mid-1;
                    }
                     else if(target>matrix[i][mid]){
                        s=mid+1;
                    }//else if
                }//while
            }//if
        }//for
        return false;
    }
}