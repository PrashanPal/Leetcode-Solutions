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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        // if(root.val==subRoot.val){
        //     return c(root,subRoot);
        // }
         if(c(root,subRoot)) return true;
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    public boolean c(TreeNode r,TreeNode sr){
        if(r==null&&sr==null) return true;
        else if(r!=null&&sr==null) return false;
       else if(r==null&&sr!=null) return false;
       else if(r.val!=sr.val) return false;
        return c(r.left,sr.left)&&c(r.right,sr.right);
    }
}