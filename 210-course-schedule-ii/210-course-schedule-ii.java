class Solution {
    //NOTE:Tool for printing in topological order,here just by checking that graph is connected or not you can,t do it,so its good to       use this tool whenever you have to print in topological order
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> g=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            g.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int c=prerequisites[i][0];//course name
            int v=prerequisites[i][1];//prerequivisit of course c
            g.get(c).add(v);
        }
        Queue<Integer> q=new ArrayDeque<>();//put all the courses having 0 indegree or 0 prerequivisit
        int a[]=new int[numCourses];
        for(int i=0;i<g.size();i++){
            int l=g.get(i).size();
            a[i]=l;
            if(l==0){
                q.add(i);
            }
        }//for
         Queue<Integer> res=new ArrayDeque<>();//for storing answers
        boolean b[]=new boolean[numCourses];//if a course is already completed ,then no need to trace it again
        while(q.size()>0){
            int t=q.poll();
            res.add(t);
            if(b[t]==false){
                for(int i=0;i<g.size();i++){
                    if(g.get(i).contains(t)){
                        a[i]-=1;
                        if(a[i]==0){
                            q.add(i);
                        }//if
                    }//if
                }//for
            }//if
        }//while
        if(res.size()==numCourses){
            int ans[]=new int[numCourses];
            int i=0;
            while(res.size()>0){
                ans[i]=res.poll();
                i++;
            }//for
            return ans;
        }//if
          int an[]=new int[0];//an empty array
        return an;
    }
}