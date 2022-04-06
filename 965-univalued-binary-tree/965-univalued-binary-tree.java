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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        return h(root,root.val);
    }
    
    public boolean h(TreeNode r,int t){
        if(r==null){
            return true;
        }
        if(r.val!=t){
            return false;
        }
        return h(r.left,t)&&h(r.right,t);
    }
}