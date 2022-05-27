class Solution {
    // method2
    //Very important TOOL and CONCEPT
    //Approach used BFS i,e, radius wise Propagation
     private static class Pair {
    int x;
    int y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
      private static int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    public int[][] updateMatrix(int[][] matrix) {
        LinkedList<Pair> queue = new LinkedList<>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 1) {
          matrix[i][j] = -1;// initaially mark all the 1s as unvisited
        } else {
          queue.addLast(new Pair(i, j));// add 0 valued cell in queue
        }
      }
    }
    int length = 0;//radius of the BFS
    while (!queue.isEmpty()) {
      int size = queue.size();
      length++;
      while(size>0) {
        Pair rem = queue.removeFirst();
          size--;
        for (int[] dir : dirs) {
          int idash = rem.x + dir[0];
          int jdash = rem.y + dir[1];

          if (idash >= 0 && jdash >= 0 && idash < matrix.length && jdash < matrix[0].length) {
            if (matrix[idash][jdash] == -1) {
              matrix[idash][jdash] = length;
              queue.addLast(new Pair(idash, jdash));
            }//if
          }//fi
        }//for
      }//for
    }//while
    return matrix;
    }
}