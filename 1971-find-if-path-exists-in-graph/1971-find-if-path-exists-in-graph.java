class Solution {
     public boolean validPath(int n, int[][] edges, int start, int end) {
	 
	 /************ Building graph  Start ***************/
	 
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        } 
         //NOTE-- this step is an important tool
        for(int[] edge : edges){//here we are creating a graph array ,with help of given 2-D array(important tool)
            graph[edge[0]].add(edge[1]);//where graph[edge[0]]=arraylist at idex=edge[0];
            graph[edge[1]].add(edge[0]);
        }
		
		/************ Building graph  End ***************/
         //NOTE--DFS and BFS avoids the need of recurrsive approach
		
        boolean[] visited = new boolean[n];
        Queue<Integer> q= new ArrayDeque<Integer>();
        q.add(start);//def approach is used ---> non-recursive approach
         visited[start] = true;
        while (!q.isEmpty()) {
            int current = q.remove();
            if (current == end) return true;
            for (int neighbor : graph[current]) {//where graph[current]-->an arraylist
                if (!visited[neighbor]) {
                     visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return false;      
     }
}