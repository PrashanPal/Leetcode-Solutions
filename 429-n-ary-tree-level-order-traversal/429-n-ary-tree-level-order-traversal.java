/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> r=new ArrayList<>();
        if(root==null) return r;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
       int s=q.size();
        while(q.size()>0){
            s=q.size();
              List<Integer> a=new ArrayList<>();
        while(s-->0){
            Node t=q.poll();
            a.add(t.val);
            for(Node e:t.children){
                q.add(e);
            }//for
        }//while
              r.add(a);
        }//while
        return r;
    }
}