class Solution{

//p2 --Pep cpurses schedule
    //n2-45
    //method1 ---THIS METHOD IS ILLOGICAL FOR ME
    //method 2---good and easy ,i.e based on to detect cycle in Directed Graph--n2-48
    //tool for topological sort
    //this is method 2--here we are using DFS ,but you can use BFS also
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();// here we use arraylist instead of array because no array are more then number of couses available,because one array represent only one prerequivist,and if a course have 4 ,prerequivisets then insted of 1 ,4 arrays are provided
		for (int i = 0; i < numCourses; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < prerequisites.length; i++) {
			int u = prerequisites[i][0];//course
			int v = prerequisites[i][1];//it prerequisites

			graph.get(u).add(v);
		}
        int a[]={0};       
        boolean visited[]=new boolean[graph.size()];//to mark actually visited
         boolean dfsvis[]=new boolean[graph.size()];//for marking visited only traversing through a dfs                                                        cycle
        for(int i=0;i<graph.size();i++){
            //check method is used to detect cycle in a graph
            if(visited[i]==false){
            check(graph,visited,dfsvis,i,a);
                if(a[0]==1)
                return false;
            }//if
            //i.e. all courses cant be complete because of cycle
        }
        System.out.println(a[0]);
         return true;//since graph is not cyclic ,hence all courses can be completed
	}
    public boolean check(ArrayList<ArrayList<Integer>> g, boolean[] v,boolean[] dfs,int src,int a[]){
        v[src]=true;
        dfs[src]=true;
        for(Integer e:g.get(src)){
            if(v[e]==false){
                boolean res=check(g,v,dfs,e,a);
                if(res==true){
                    a[0]=1;
             return true;
                }//if
            }//if
            else if(v[e]==true&&dfs[e]==true){
                  a[0]=1;
                return true;//cycle is found
            }//else if
            //  else if(v[e]==true&&dfs[e]==false){
            //     boolean res=check(g,v,dfs,e,a);
            //     if(res==true){
            //         a[0]=1;
            //  return true;
            //     }//if
            // }//else if
        }//for
        dfs[src]=false;//necessary to unmark ,to also make it ready to use in another dfs cycle
        return false;
    }//check
}//class

