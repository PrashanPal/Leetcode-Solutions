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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        List<List<Integer>> r=new ArrayList<>();
        if(root==null){
            return r;
        }
        q1.add(root);
        while(q1.size()!=0){
            ArrayList<Integer> b=new ArrayList<>();
            int s=q1.size();
            for(int i=0;i<s;i++){
            TreeNode t=q1.remove();
            b.add(t.val);
            if(t.left!=null){
            q1.add(t.left);
                }
            if(t.right!=null){
            q1.add(t.right);
                }
            }//for
            r.add(b);
        }//while
        return r;
    }
}