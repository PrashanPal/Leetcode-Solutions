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
    public int sumOfLeftLeaves(TreeNode root) {
        int s=0;
        int t=h(root,s,0);
        return t;
    }
    public int h(TreeNode r,int s,int f){
        if(r==null)
            return 0;
        if(r.left==null&&r.right==null){
            if(f==1){
                return r.val;
            }
            return 0;
        }
        int p=0,q=0;
        if(r.right!=null){
            p= h(r.right,s,2);
        }
        if(r.left!=null){
            q=h(r.left,s,1);
        }
        return p+q;
    }
}