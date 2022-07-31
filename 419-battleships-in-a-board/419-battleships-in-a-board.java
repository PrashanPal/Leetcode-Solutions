class Solution {
    //n2-123
    //approach0: if use travel and chage approach then its a simple dfs based traversal problem where we have to traverse in each shell and modify it but question says can yo do it in o(1) space and without modifying the values in shell i.e you only have to traverse but not to change ,so we can also do it ,but in approach1 ,currently we are using simple broutforce approach in approach0 i.e travel and chage method using dfs
    
    //approach1: 
//     A head of a battleship means the top most or left most cell with value 'X'.
// Thus, we only need to count those heads.

// There are three rules to tell if a cell is a 'head':

// The cell is a 'X' (board[i][j] == 'X')
// No left side neighbor, or the left neighbor is a '.' (i == 0 || board[i - 1][j] == '.')
// No right side neighbor, or the right neighbor is a '.' (j == 0 || board[i][j - 1] == '.')
// Code:

public int countBattleships(char[][] board) {
	if (board == null || board.length == 0 || board[0].length == 0) return 0;
	int R = board.length, C = board[0].length, cnt = 0;
	for (int i = 0; i < R; i++) {
		for (int j = 0; j < C; j++) {
			if (board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.'))
				cnt++;
		}
	}
	
	return cnt;
}
    }//class
// ...Note...
// For a statement like if (A && B && C), when A is false, the program will not compute B and C.
// So, for the best performance, we write the program in this way, instead of using a lot of if statements.
