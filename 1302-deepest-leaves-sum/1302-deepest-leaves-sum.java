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
        List<List<Integer>> a= new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0){
            List<Integer> b=new ArrayList<>();
        int s=q.size();
        while(s>0){
            TreeNode t=q.remove();
            b.add(t.val);
            if(t.left!=null)
            q.add(t.left);
            if(t.right!=null)
             q.add(t.right);
            s--;
        }//while
            a.add(b);
        }//while
        List<Integer> c=new ArrayList<>(a.get(a.size()-1));
        int s=0;
        for(Integer i:c){
            s=s+i;
        }
        return s;
    }
}