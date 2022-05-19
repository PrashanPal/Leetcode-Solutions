* https://leetcode.com/problems/find-if-path-exists-in-graph/discuss/1518758/Java-DFS-Easy-to-understand-Iterativeclass
* **Pep-level1-graph**--Has path question.
* **Approach use**:  src will ask to its neighbour and neighbour will ask to its neighbour and so on.
* **Methods**--Stack for DFS
*                      ---Queue for BFS
*                      ---Recursive approach
**NOTE** since graph is bi-directional-->you are also a neighbour of your neighbour---> which can create a infinite cycle , so to avoid it we used a boolean array as flag to mark already traversed vertices
​
​
* Solution {
public boolean validPath(int n, int[][] edges, int start, int end) {
/************ Building graph  Start ***************/
ArrayList<Integer>[] graph = new ArrayList[n];
for(int i = 0; i < n; i++){
graph[i] = new ArrayList<>();
}
for(int[] edge : edges){//here we are creating a graph array ,with help of given 2-D array(important tool)
graph[edge[0]].add(edge[1]);//where graph[edge[0]]=arraylist at idex=edge[0];
graph[edge[1]].add(edge[0]);
}