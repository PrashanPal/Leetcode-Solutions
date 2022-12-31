//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);

            ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

            int i = 0;
            while (i++ < E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<>();
                t1.add(u);
                t1.add(v);
                t1.add(w);
                edges.add(t1);
            }

            int S = Integer.parseInt(read.readLine());

            Solution ob = new Solution();

            int[] ptr = ob.bellman_ford(V, edges, S);

            for (i = 0; i < ptr.length; i++) System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
*   edges: vector of vectors which represents the graph
*   S: source vertex to start traversing graph with
*   V: number of vertices
*/
class Solution {//s450,graph-15.4 ,n2-77-->algo is easy to implement and understand as well
//striver method is also small ,but this method is more shorter than strivers
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here
        int dis[]=new int[V];
        Arrays.fill(dis,(int)1e8);
        dis[S]=0;
        //at max V-1 ,iterations are needed
        int j=0;
        while(j++<V){//ie total 'V' relaxations are performed here
            int f=0;//it will indicate that any updates are made in dis[] array in this iteration or not
            for(ArrayList<Integer> e:edges){
                int u=e.get(0);
                int v=e.get(1);
                int w=e.get(2);
                if(dis[u]!=(int)1e8&&dis[u]+w<dis[v]){
                    f++;//i.e dis[] array is updated here
                    dis[v]=dis[u]+w;
                }//if
            }//for
            if(f==0){//i.e in the whole iteration ,no updation is made on this dis[] array,i,e our dis[] array
            //is stores our required and no need to do further iterations ,also graph doest contains any -ve
            //weight cycle ,because total no. of iterations perfor is less than (V);
            return dis;
            }//if
            if(j==V&&f>0){//this means in its Vth iteration ,dis[] array is still updates -->means it contains
            //a -ve weight cycle
                int ans[]={-1};
                 return ans;
            }//if
        }//while
        return dis;
    }
}
