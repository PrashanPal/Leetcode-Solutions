// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int b[][]=new int[matrix[0].length][matrix.length];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 b[j][i]=matrix[i][j];
//             }//for
//         }//for
//         return b;
//     }
// }

class Solution {
    //this method is little more optimized than me , as it have additional case to handle inplace it n==m i.e
    // a square matrix can be transposed in o(1) space i.e. inplace
public int[][] transpose(int[][] A) {
		if (A.length == A[0].length) {
				inPlace(A);
				return A;
		}        
		int[][] B = new int[A[0].length][A.length];
		for (int i=0; i<A.length ; i++) {
				for (int j=0; j<A[0].length ; j++) {
						B[j][i] = A[i][j];
				}
		}        
		return B;
}

private void inPlace(int[][] A) {
		int col = 0;
		for (int i = 0; i<A.length ; i++) {
				for (int j=col ; j<A[0].length ; j++) {
						int temp = A[i][j];
						A[i][j] = A[j][i];
						A[j][i] = temp;
			}//for
				col++;
	}//for
}//inPlace
}//class