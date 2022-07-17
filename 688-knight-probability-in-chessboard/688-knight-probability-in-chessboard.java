class Solution {
    //concept:great dp solution p2
    //n2--105
    //previous trival dfs traversing approach will not work here
    static int a[][]={{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2}};
    public double knightProbability(int n, int k, int row, int column) {
       
       //we will take to grid i.e current and next,from modifying current we will get next
        double cur[][]=new double[n][n];//this of double type because it have to store probability
         double next[][]=new double[n][n];//this of double type because it have to store probability
        //since initially knight is at cur[row][column] so its probability is 1 at 0 moves
        cur[row][column]=1;
        for(int m=1;m<=k;m++){//i.e for m times i.e for each cycle of moves till m times we have calculate next using current
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int nexti=0;
                    int nextj=0;
                    for(int p=0;p<8;p++){
                        nexti=i+a[p][0];
                        nextj=j+a[p][1];
                        if(nexti>=0&&nexti<n&&nextj>=0&&nextj<n){
                            next[nexti][nextj]+=cur[i][j]/8.0;
                        }//if
                    }//for p
                }//for j
            }//for i 
                //after each move next becames current and new next is assigd to previous next
                cur=next;
                next=new double[n][n];
            }//for ,final for .ie. m
            double sum=0;//for calculate probability of each cell in cur
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++){
                   // System.out.print(cur[i][j]+" ");
                    sum+=cur[i][j];
                }
        return sum;
    }//
}//class