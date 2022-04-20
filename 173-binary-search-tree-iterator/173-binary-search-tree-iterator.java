/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
      Stack<TreeNode> s;
    public BSTIterator(TreeNode root) {
        s=new Stack<>();
        addnodel(root);
    }
    public void addnodel(TreeNode r){
        while(r!=null){
            this.s.push(r);
            r=r.left;
        }
    }
    public int next() {
        TreeNode t=this.s.pop();
        addnodel(t.right);
        return t.val;
    }
    
    public boolean hasNext() {
        return s.size()>0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */