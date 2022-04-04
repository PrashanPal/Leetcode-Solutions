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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double> r=new ArrayList<>();
        if(root==null){
            return r;
        }
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()!=0){
            int s=q.size();
            int c=0;
            double sum=0.0;
            for(int i=0;i<s;i++){
                TreeNode t=q.remove();
                 sum=sum+t.val; 
                c++;
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }//for
            double a=sum/c;
            r.add(a);
        }//while
        return r;
    }
}