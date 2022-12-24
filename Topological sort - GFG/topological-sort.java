//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov + 1; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    //n2-53(kahn's algorithm) ,se450, graph-15.3 topo sort
    //topological sort->n2-32
    {
        // add your code here
        int a[]=new int[V];
       for(int i=0;i<V;i++){
            for(int e:adj.get(i)){
                a[e]=a[e]+1;
            }//for
        }//for
        Queue<Integer> q=new ArrayDeque<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(a[i]==0){
               q.add(i); 
                st.push(i);
            }
        }//for
        f(adj,q,st,a,V);
        int i=V-1;
        while(st.size()>0){
            a[i]=st.pop();
            i--;
        }///while
        //now our array 'a' is filled with final ans
        return a;
        }//f
        public static void f(ArrayList<ArrayList<Integer>> adj,Queue<Integer> q,Stack<Integer> st,int a[],int v){
            while(q.size()>0){
                int s=q.size();
                while(s-->0){
                    int t=q.remove();
                    for(int e:adj.get(t)){
                        a[e]=a[e]-1;//ie endegree decreases by 1
                        if(a[e]==0){
                          q.add(e); 
                           st.push(e);
                        }//if
                    }//for
                }//while s
            }//while 
        }
}
 