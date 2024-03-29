//Hi, here I am sharing O(nlogn) Java solution. If any suggestion or question, feel free to ask. :)
//this solution is based on priorityque ,since we only need to return the count of integers in the set ,not the list of integers 
class Solution {
    public int minSetSize(int[] arr) {
        
        int n = arr.length;
        if(n==1 || n==2) return 1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//it will contains frequecies on elements of array in the decreasing order
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(Integer x: arr){
            map.put(x,map.getOrDefault(x, 0) + 1);
        }
        for(Integer x: map.values()){
            pq.offer(x);
        }
        int res = 0;
        int cnt = 0;
        while(res < n/2 && pq.size() > 0) {
            res += pq.poll();
            cnt++;
        }
        return cnt;
    }
}