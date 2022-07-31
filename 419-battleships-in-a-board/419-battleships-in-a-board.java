class Solution {
    //n2-123
    //approach0: if use travel and chage approach then its a simple dfs based traversal problem where we have to traverse in each shell and modify it but question says can yo do it in o(1) space and without modifying the values in shell i.e you only have to traverse but not to change ,so we can also do it ,but in approach1 ,currently we are using simple broutforce approach in approach0 i.e travel and chage method using dfs
    public int countBattleships(char[][] board) {
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                
                if(board[i][j]=='X'){
                    boolean f[]={true};
                    if(check(board,i,j,f)){
                        count++;
                    }//if
                }//if
            }//for j
        }//for i
        return count;
    }//fn
    
    public boolean check(char b[][],int i,int j,boolean[] f){
        b[i][j]='1';
        int m=b.length;
        int n=b[0].length;
        if(i+1<m&&j+1<n&&b[i+1][j]=='X'&&b[i][j+1]=='X'){
            f[0]=false;//i.e it can propagate both horizontally and vertically ,so this battleship is invalid
            check(b,i+1,j,f);
            check(b,i,j+1,f);
        }
       else if(i+1<m&&j-1>=0&&b[i+1][j]=='X'&&b[i][j-1]=='X'){
            f[0]=false;//i.e it can propagate both horizontally and vertically ,so this battleship is invalid
            check(b,i+1,j,f);
            check(b,i,j-1,f);
        }
       else if(i-1>=0&&j+1<n&&b[i-1][j]=='X'&&b[i][j+1]=='X'){
            f[0]=false;//i.e it can propagate both horizontally and vertically ,so this battleship is invalid
            check(b,i-1,j,f);
            check(b,i,j+1,f);
        }
       else if(i-1>=0&&j-1>=0&&b[i-1][j]=='X'&&b[i][j-1]=='X'){
            f[0]=false;//i.e it can propagate both horizontally and vertically ,so this battleship is invalid
            check(b,i-1,j,f);
            check(b,i,j-1,f);
        }
        else if(i+1<m&&b[i+1][j]=='X') check(b,i+1,j,f);
        else if(i-1>=0&&b[i-1][j]=='X') check(b,i-1,j,f);
        else if(j+1<n&&b[i][j+1]=='X') check(b,i,j+1,f);
        else if(j-1>=0&&b[i][j-1]=='X') check(b,i,j-1,f);
        return f[0];
    }//check
    
}//class