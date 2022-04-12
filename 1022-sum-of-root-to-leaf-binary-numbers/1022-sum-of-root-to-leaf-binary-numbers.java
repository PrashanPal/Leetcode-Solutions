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
    public int sumRootToLeaf(TreeNode root) {
        String s="";
        ArrayList<String> a=new ArrayList<>();
        h(a,root,s);
        int sum=0;
        for(String i:a){
          sum+=Integer.parseInt(i,2);  
        }
        return sum;
            
    }
    public void h(ArrayList<String> a,TreeNode r,String s){
        if(r==null) return;
        s+=Integer.toString(r.val);
        if(r.left==null&&r.right==null){
            a.add(s);
            return;
        }
        h(a,r.left,s);
          h(a,r.right,s);
        
    }
}