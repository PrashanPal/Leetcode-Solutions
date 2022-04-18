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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        ArrayList<Integer> a=new ArrayList<>();
        h(root,k,a);
        return a.get(k-1);
    }
    public void h(TreeNode r,int k,ArrayList<Integer> a){
        if(r==null) return;
        h(r.left,k,a);
        a.add(r.val);
        if(a.size()==k){
            return ;
        }
        h(r.right,k,a);
        return;
    }
}