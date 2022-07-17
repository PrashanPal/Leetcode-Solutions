class Solution {
    //after reading solution
    //concept:great dp solution p2
    //n2--105
    //previous trival dfs traversing approach will not work here
    int [][] direction =new int[][]{{2,1},{-2,1},{2,-1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
   
    public double knightProbability(int N, int K, int r, int c) {
        double [][] current = new double[N][N];//it is of double type because it have to store probability
            double [][] next = new double[N][N];//it becames next
        //since initially i.e at 0 moves knight is at current[r][c], at initally probability at current[r][c]=1
        current[r][c]=1;
      
        for(int k=1; k<=K;++k){
        //    double [][] next = new double[N][N];//it becames next
            for(int i=0; i<N;++i){
                for(int j=0; j<N;++j){
                    for(int [] dir: direction){
                        int nextR = i-dir[0];
                        int nextC = j-dir[1];
                        if(nextR>=0 && nextC>=0 && nextR<N && nextC<N){
                            next[i][j]+=(current[nextR][nextC]/8.0);
                        }//if
                    }//for dir
                }//for j
            }//for i
            current=next;//current becames next
            next=new double[N][N];
        }
          double sum = 0;
        for(int i=0; i<N;++i){// to calculate total probability i.e sum of probability at each cell of current after k moves will be our required ans
            for(int j=0; j<N;++j){
                sum+=current[i][j];
            }
        }
        return sum;
    }
}//class