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
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        StringBuilder s=new StringBuilder("");
        check(root,s);
        return s.toString();
    }
    public void check(TreeNode root,StringBuilder s){
         if(root==null) return;
        s.append(String.valueOf(root.val));
        if(root.left==null&&root.right==null) return;
        //for left subtree
        s.append("(");
        check(root.left,s);
        s.append(")");
        //for right subtree
        if(root.right!=null){
          s.append("(");
        check(root.right,s);
        s.append(")");
        }//if
        
    }
}