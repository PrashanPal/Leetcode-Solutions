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
    int b;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        return h(root,k);
    }
    public int h(TreeNode r,int k){
        if(r==null) return 0;
        int l=h(r.left,k);
        if(l!=0) return l;
        b=b+1;
        if(b==k) return r.val;
        int f=h(r.right,k);
        if(f!=0) return f;
        return 0;
    }
}
