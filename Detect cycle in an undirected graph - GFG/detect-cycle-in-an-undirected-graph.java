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


class Solution {
    //bfs based approach
    // Function to detect cycle in an undirected graph.
    //since graph is undirected so 1->2 and 2->1 both are same ,so it is also a cycle and we have to avoid 
    //this case  so ,its necessay to pass both current object and parent
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean b[]=new boolean[v];
        boolean bb[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(b[i]==false){
                boolean r=detect(b,bb,adj,v,i);
                if(r==true) return true;
            }//if
        }//for
        return false;//i,e not cyclic
    }
    public boolean detect(boolean b[],boolean bb[],ArrayList<ArrayList<Integer>> a,int v,int j){
        b[j]=true;
        bb[j]=true;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(j);
        int s=q.size();
        while(s-->0){
            int t=q.remove();
            //bb[t]=false;//i.e element is removed from queue
         ArrayList<Integer> aa=new ArrayList<>(a.get(t));
         for(int i=0;i<aa.size();i++){
             int m=aa.get(i);
             if(b[m]==true&&bb[m]==true) //ie element is already traversed and also currently present in queue
             return true;//cycle is present
             else if(b[m]!=true){//i.e if its adjacent vertex is not already traversed,to avoid repetition
                 q.add(m);
                 s++;
                 b[m]=true;
                 bb[m]=true;
             }//else if
         }//for
         bb[t]=false;//i.e element is removed from queue
        }//while
        bb[j]=false;
        return false;
    }//detect 
}