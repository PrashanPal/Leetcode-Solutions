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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return h(root.left,root.right);
    }
    
    public boolean h(TreeNode l,TreeNode r){
        if(l==null&&r==null) return true;
        if(l==null||r==null) return false;
        else if(l.val!=r.val) return false;
        return h(l.left,r.right)&&h(l.right,r.left);
    }
}