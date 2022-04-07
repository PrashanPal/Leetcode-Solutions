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
   
     public void flatten(TreeNode root) {
        if(root==null)
            return;
         h(root,null);
     }
    public TreeNode h(TreeNode r,TreeNode t) {
        if(r==null)
            return  t;
        
        t =h(r.right,t);
         t= h(r.left,t); 
        r.right=t;
        r.left=null;
        t=r;
         return r;   
    }//h
}//class