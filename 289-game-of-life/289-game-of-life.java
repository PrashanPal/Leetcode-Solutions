class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;//rows
        int m=board[0].length;//columns
        int a[][]=new int[n][m];
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                int count=0;
                if(r-1>=0&&c-1>=0){
                    if(board[r-1][c-1]==1){
                        count++;
                    }
                }//1
                if(r-1>=0&&c>=0){
                    if(board[r-1][c]==1){
                        count++;
                    }
                }//2
                if(r-1>=0&&c+1<m){
                    if(board[r-1][c+1]==1){
                        count++;
                    }
                }//3
                if(r>=0&&c-1>=0){
                    if(board[r][c-1]==1){
                        count++;
                    }
                }//4
                if(r>=0&&c+1<m){
                    if(board[r][c+1]==1){
                        count++;
                    }
                }//5
                if(r+1<n&&c-1>=0){
                    if(board[r+1][c-1]==1){
                        count++;
                    }
                }//6
                if(r+1<n&&c>=0){
                    if(board[r+1][c]==1){
                        count++;
                    }
                }//7
                if(r+1<n&&c+1<m){
                    if(board[r+1][c+1]==1){
                        count++;
                    }
                }//8
                //now next thing
                if(count<2){//rule 1 under population death
                    a[r][c]=0;//
                }
               else if((count==2||count==3)&&board[r][c]==1){// rule 2
                   a[r][c] =1;
                }
                else if(count==3&&board[r][c]==0){//rule 4--reproduction occurs
                    a[r][c]=1;
                }
                 else if(count>3&&board[r][c]==1){//rule 3--over populaton death
                    a[r][c]=0;
                }//else if
            }//for c;
        }//for r
         
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                board[r][c]=a[r][c];
            }//for
        }//for
        
    }
}