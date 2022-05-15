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
    public int deepestLeavesSum(TreeNode root) {
        //List<List<Integer>> a= new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        int sum=0;
        while(q.size()>0){
            sum=0;
        int s=q.size();
        while(s>0){
            TreeNode t=q.remove();
            if(t.left!=null)
            q.add(t.left);
            if(t.right!=null)
             q.add(t.right);
            s--;
            sum=sum+t.val;
        }//while
        }//while
        return sum;
    }
}