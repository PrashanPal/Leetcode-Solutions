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
        ArrayList<String> a=new ArrayList<>();
        h(root,a,"");
        int sum=0;
        for(String i:a){
             sum+=Integer.parseInt(i);  
        }
        return sum;
    }
    public void h(TreeNode r,List<String> a,String s){
        if(r==null) return;
        if(r.left==null&&r.right==null){
            s+=Integer.toString(r.val);
            a.add(s);
            return;
        }
        h(r.left,a,s+Integer.toString(r.val));
         h(r.right,a,s+Integer.toString(r.val));
    }
}