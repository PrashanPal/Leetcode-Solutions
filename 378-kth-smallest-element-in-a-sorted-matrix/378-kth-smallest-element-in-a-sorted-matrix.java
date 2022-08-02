class Solution {
    //approach0: we will use a priority queue of size k ,and put all the matrix elements in it as will doing so ,it the size of priority increases then k ,then simply remove one elements from its top ,i.e we have to maintain k size priority queue till its end 
    // not the 1st element of this priorityqueue will be our answer
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
                if(pq.size()>k)
                    pq.poll();
            }//for
        }//for
        return pq.poll();
    }
}