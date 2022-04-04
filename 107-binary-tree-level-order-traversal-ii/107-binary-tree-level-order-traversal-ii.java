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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> r=new ArrayList<>();
        if(root==null){
            return r;
        }
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()!=0){
            int s=q.size();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode t=q.remove();
                a.add(t.val);
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }//for
            r.add(0,a);
        }//while
        
       
        return r;
    }
}