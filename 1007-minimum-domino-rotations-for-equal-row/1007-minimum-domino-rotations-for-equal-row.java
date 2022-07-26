class Solution {
    //n2--112
    //p2
    //approach me:brute force approach  ,time==nlogn  ,space==n+n
   //create a hashmap for tops and put elements as keys and there frequencies as value , and sort this hashmap on the basis of frequencies
    //create another hashmap for bottoms and do the same as we do for tops array
    //now compare each element one by one on the basis of its frequencies and its complimentary frequencie in other map
    
    //optimed approach ,it takes 3 arrays of size 7 ,time ==n ie, 7
    // see n2--112
    public int minDominoRotations(int[] A, int[] B) {
        int[] countA = new int[7], countB = new int[7], same = new int[7];
        int n = A.length;
        for (int i = 0; i < n; ++i) {
            countA[A[i]]++;
            countB[B[i]]++;
            if (A[i] == B[i])
                same[A[i]]++;
        }
        for (int i  = 1; i < 7; ++i)
            if (countA[i] + countB[i] - same[i] == n)//most important line
                return n - Math.max(countA[i], countB[i]);
        return -1;
    }
}//class