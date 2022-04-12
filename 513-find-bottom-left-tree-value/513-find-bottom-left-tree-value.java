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
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> a=new ArrayDeque<>();
        Queue<Integer> b=new ArrayDeque<>();
        a.add(root);
          return h(a,root,b);
    }
    public int h(Queue<TreeNode> a,TreeNode r,Queue<Integer> b){
        while(a.size()!=0){
        int s=a.size();
            b=new ArrayDeque<>();
        while(s>0){
            TreeNode t=a.remove();
            b.add(t.val);
            if(t.left!=null) a.add(t.left);
            if(t.right!=null) a.add(t.right);
            s--;
        } 
        }//while
        return b.remove();
    }
}