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
    //this is really a nice question
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return root;
        boolean b=check(root);
        if(b==false) return null;
        return root;
    }
    public boolean check(TreeNode root){
        if(root==null) return false;
           boolean l= check(root.left);
         if(l==false&&root.left!=null) root.left=null;
           boolean r= check(root.right);  
          if(r==false&&root.right!=null) root.right=null;
        
        if(l==false&&r==false&&root.val==0) return false;
        else   if(l==false&&r==false&&root.val==1) return true;
        
        
        return true;
    }
}