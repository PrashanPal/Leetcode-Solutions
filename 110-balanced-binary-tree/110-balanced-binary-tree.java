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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int t=h(root);
        if(t<0){//if returned value is -1
            return false;
        }
        return true;
    }
    public int h(TreeNode r){
        if(r==null){
            return 0;
        }
        int l=h(r.left);
        int f=h(r.right);
        if(l<0||f<0||Math.abs(l-f)>1){
//this is the most important line, i,e if any one is unblanced then return -1, and this chain continue
            return -1;
        }
        return Math.max(l,f)+1;
    }
}