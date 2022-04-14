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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        if(root==null) return a;
        h(root,a,0);
        return a;
    }
    public void h(TreeNode r,List<Integer> a,int h){
        if(r==null) return;
        if(a.size()==h){
            a.add(r.val);
        }
        h(r.right,a,h+1);
         h(r.left,a,h+1);
    }
}