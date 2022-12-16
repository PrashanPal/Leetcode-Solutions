//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java



// User function Template for Java

//s450 graph -->bfs/dfs 15.2 ,n2-54
//PLEASE REMEMBER THIS: this question is very important as it involves path tracing of dfs flow, and stroing 
//all these strings of path traces dfs traversal into set, we are using set here bcz it does't store repeated
//paths, so it only store all the islands having unique path and hence set.size()--> total no. of unique islands
//by the comparison of there structur

//this approach is very helpfull for future and all remember this code becz its to easy to understand
//QUESTION: why you used dfs approach here can we also use bfs approach for path tracing string creation?
//ANSWER: no we can't use bfs approahc fere tracing its path in the form of string ,bcz bfs increases radially
//so it is immpossible to trace its paths uniquelly, and hence for path tracing in string ,only dfs approach is
//used always
class Solution {
//approch: use string and set concept
//awesome solution by me
//s450
 StringBuilder sb=new StringBuilder("");
    public int countDistinctIslands(int[][] grid) {
        // Your Code here
        Set<String> hs=new HashSet<>();
        //StringBuilder sb=new Stringbuilder("");
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++){
             sb=new StringBuilder("");
            if(grid[i][j]==1) {
                find(grid,i,j);
                hs.add(sb.toString());
        }//if
        }//for
        return hs.size();
    }//count fun
    public void find(int[][] g,int i,int j){
        if(i<0||j<0||i==g.length||j==g[0].length||g[i][j]!=1){
            return;
        }
        g[i][j]=-1;//to mark it visited
        if(i<g.length-1&&g[i+1][j]==1){
            sb.append("e");//nice 
             find(g,i+1,j);
        }
        if(i>0&&g[i-1][j]==1){
            sb.append("w");//nice
            find(g,i-1,j); 
        }
        if(j<g[0].length-1&&g[i][j+1]==1){
            sb.append("s");//nice
        find(g,i,j+1); 
        }
        if(j>0&&g[i][j-1]==1) {
            sb.append("n");//nice
            find(g,i,j-1); 
        }
        sb.append("b");//i.e for representing the point of backtracking in the dfs path flow, and it is the
        //most important step ,because it avoids all the chance of error or inaccuracy
        
    }
}