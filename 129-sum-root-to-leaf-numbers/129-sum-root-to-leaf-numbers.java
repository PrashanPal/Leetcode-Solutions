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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        return h(root,0);
    }
    public int h(TreeNode r,int sum){
        if(r==null) return 0;
        sum=sum*10+r.val;
        if(r.left==null&&r.right==null){
            return sum;
        }
         return h(r.left,sum) + h(r.right,sum);
    }
}