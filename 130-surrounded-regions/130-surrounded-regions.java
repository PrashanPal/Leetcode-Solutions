class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
        for(int j=0;j<board[i].length;j++){
            if(i==0||j==0||i+1==board.length||j+1==board[i].length){
                if(board[i][j]=='O')
                    h(board,i,j);
            }//if
        }//for
        }//for
         for(int i=0;i<board.length;i++){
        for(int j=0;j<board[i].length;j++){
            if(board[i][j]=='1')
                board[i][j]='O';
            else if(board[i][j]=='O')
                board[i][j]='X';
        }//for
         }//for
            
    }//solve
    public void h(char[][] g,int i,int j){
        if(i<0||j<0||i>=g.length||j>=g[i].length) return;
        if(g[i][j]=='O'){
            g[i][j]='1';
            h(g,i-1,j);
            h(g,i,j-1);
            h(g,i+1,j);
            h(g,i,j+1);
        }//if
    }//h
}//class