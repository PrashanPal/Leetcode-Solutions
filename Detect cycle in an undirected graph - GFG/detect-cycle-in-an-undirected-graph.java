//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

//for easy code of undirected graph cycle detection you can use any of dfs or bfs approach i.e out of two most
//recetly submitted solution
class Solution {//   BFS method it is--> easy striver-->undirected graph
    // Function to detect cycle in an undirected graph.
    //Note : there is no need to take an extra parent array
    class Node {
    int first;//child
    int second;//parent
    public Node(int first, int second) {
        this.first = first;
        this.second = second; 
    }
}
     public boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s,boolean vis[])
    {
       Queue<Node> q =  new LinkedList<>(); //BFS
       q.add(new Node(s, -1));//-1 is assumed to be default parent of 1st element of each new cycle or flow
       vis[s] =true;
       
       // until the queue is empty
       while(!q.isEmpty())
       {
           // source node and its parent node
           int node = q.peek().first;
           int par = q.peek().second;
           q.remove(); 
           
           // go to all the adjacent nodes
           for(Integer it: adj.get(node))
           {
               if(vis[it]==false)  
               {
                   q.add(new Node(it, node));
                   vis[it] = true; 
               }
        
                // if adjacent node is visited and is not its own parent node
               else if(par != it) return true;//this line makes code so simple and easy
           }
       }
       
       return false;
    }
    
    // function to detect cycle in an undirected graph
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[] = new boolean[V];
        Arrays.fill(vis,false);
        // int parent[] = new int[V];
        // Arrays.fill(parent,-1);  
        
        for(int i=0;i<V;i++)
            if(vis[i]==false) 
                if(checkForCycle(adj, i,vis)) 
                    return true;
    
        return false;
    }
    
}