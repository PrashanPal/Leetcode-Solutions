class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean b[]=new boolean[rooms.size()];
        Queue<Integer> q=new ArrayDeque<>();
        int c=1;
        b[0]=true;
        for(int e:rooms.get(0)){
            q.add(e);
        }
        while(q.size()>0){
            int t=q.poll();
            if(b[t]==false){
                b[t]=true;
                c++;
                for(int e:rooms.get(t)){
                    q.add(e);
                }//for
            }//if
        }//while
        if(c==rooms.size()) return true;
        return false;
    }
}