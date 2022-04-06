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
    public boolean hasPathSum(TreeNode r, int t) {
        if(r==null){
            return false;
        }
        if(r.left==null&&r.right==null){
            return t-r.val==0;
        }
        boolean l=false,f=false;
        if(r.left!=null)
            l=hasPathSum(r.left,t-r.val);
        if(r.right!=null)
            f=hasPathSum(r.right,t-r.val);
        return l||f;
    }
}