class Solution {
    //p2 --Pep cpurses schedule
    //n2-45
    //tool for topological sort
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < numCourses; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < prerequisites.length; i++) {
			int u = prerequisites[i][0];
			int v = prerequisites[i][1];

			graph.get(v).add(u);
		}

		int[] ans = findOrder(numCourses, graph);

		if(ans.length==numCourses) return true;
        return false;
	}//hn

	public static int[] findOrder(int numCourses, ArrayList<ArrayList<Integer>> graph) {

		int[] ans = new int[numCourses];
		int[] indegree = new int[numCourses];

		for (int i = 0; i < numCourses; i++) {
			for (int nbrs : graph.get(i)) {
				indegree[nbrs]++;
			}//if
		}//for

		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 0; i < indegree.length; i++) {
			if (indegree[i] == 0) {
				queue.addLast(i);
			}//if
		}//for

		int idx = 0;
		while (queue.size() > 0) {
			int rem = queue.removeFirst();
			ans[idx] = rem;
			idx++;

			for (int nbrs : graph.get(rem)) {
				indegree[nbrs]--;
				if (indegree[nbrs] == 0) {
					queue.addLast(nbrs);
				}//if
			}//for
		}//while

		if (idx == numCourses) {
			return ans;
		} 
        else {
			return new int[] { -1 };
        }//if
	}//findorder
}//class
