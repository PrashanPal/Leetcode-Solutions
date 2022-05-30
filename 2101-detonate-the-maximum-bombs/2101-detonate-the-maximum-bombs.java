class Solution {
    //apprroach: multisourcr BFS where we put all the bomb in queue for BFS that are in the choosen       bomb   
     int count = 0; // global variable, otherwise use an array
    
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            count = 0; // Start a new search, reset count
            dfs(i, new boolean[n], bombs);
            //we do the whole process for each bomb an return the maximum among the all values
            ans = Math.max(ans, count);
        }
        return ans;
    }

    private void dfs(int idx, boolean[] v, int[][] bombs) {
        count++;
        v[idx] = true;
        int n = bombs.length;
        for (int i = 0; i < n; i++) {
            if (!v[i] && inRange(bombs[idx], bombs[i])) {
                v[i] = true;
                dfs(i, v, bombs);//dfs based approach
            }
        }
    }

    private boolean inRange(int[] a, int[] b) {
        //it return that the bomb is in the of previous bom or not
        //formula used=(x-x1)^2 + (y-y1)^2=r*r;
        long dx = a[0] - b[0], dy = a[1] - b[1], r = a[2];
        return dx * dx + dy * dy <= r * r;
    }
}