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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        List<Integer> a =new ArrayList<>();
        h(a,res,root,targetSum);
        return res;
    }
    public void h(List<Integer> a,List<List<Integer>> res,TreeNode r,int t){
         a.add(r.val);
        if(r.left==null&&r.right==null){
            if(t-r.val==0){
           
                res.add(new ArrayList<Integer>(a));////very important line 
            }
            return ;
        }//if
        if(r.left!=null){
           // a.add(r.val);
           h(a,res,r.left,t-r.val);
            a.remove(a.size()-1);
          }
        if(r.right!=null){ 
           // a.add(r.val);
            h(a,res,r.right,t-r.val);
             a.remove(a.size()-1);
           }
        // now both left and right are null
        return;
    }
}