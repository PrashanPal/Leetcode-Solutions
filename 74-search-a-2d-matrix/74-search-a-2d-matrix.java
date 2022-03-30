class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0]<=target&&matrix[i][n-1]>=target){
            
                return binarySearch(matrix,0,n-1,target,i);
        
             }//for
        }//for
        return false;
    }
    
     public boolean binarySearch(int arr[][], int first, int last, int key,int i){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[i][mid] < key ){  
        first = mid + 1;     
      }//if
       else if ( arr[i][mid] == key ){  
         return true; 
      }//else if
       else{  
         last = mid - 1;  
      } //else 
      mid = (first + last)/2;  
   } //while 
   if ( first > last ){  
      return false;  
   }//if  
         return false;
 }//bs 
}//class