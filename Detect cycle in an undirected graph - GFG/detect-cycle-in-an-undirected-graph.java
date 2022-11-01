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
    // Function to detect cycle in an undirected graph.
    //since graph is undirected so 1->2 and 2->1 both are same ,so it is also a cycle and we have to avoid 
    //this case  so ,its necessay to pass both current object and parent
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean b[]=new boolean[v];
        boolean bb[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(b[i]==false){
                boolean r=detect(b,bb,adj,v,i,-1);
                if(r==true) return true;
            }//if
        }//for
        return false;//i,e not cyclic
    }
    public boolean detect(boolean b[],boolean bb[],ArrayList<ArrayList<Integer>> a,int v,int j,int p){
        b[j]=true;
        bb[j]=true;
      //  System.out.println(p);
        ArrayList<Integer> aa=new ArrayList<>(a.get(j));
        for(int i=0;i<aa.size();i++){
            int t=aa.get(i);
            if(t!=p){
                if(b[t]==false){
                    boolean r=detect(b,bb,a,v,t,j);
                    if(r==true) return true;
                }//if
                if(b[t]==true&&bb[t]==true) return true;
            }//if
        }//for
        bb[j]=false;
        return false;
    }//detect 
}