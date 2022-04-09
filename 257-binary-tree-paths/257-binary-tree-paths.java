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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> a=new ArrayList<>();
        if(root==null){
            return a;
        }
        
        String s=Integer.toString(root.val);
        h(root,a,s);
        return a;
    }
    
    public void h(TreeNode r,List<String> a,String s){
        if(r.left==null&&r.right==null){
            String t=s;
            a.add(t);
            return;
        }
        String p="";
        if(r.left!=null){
           // String s1=Integer.toString(r.left.val);
           // s=s+"->"+s1;
            
           // s+=Integer.toString(r.left.val);
             p=Integer.toString(r.left.val);
        h(r.left,a,s+"->"+p);
           // s=s.substring(0,s.length()-s1.length()-2);
        }
        
        if(r.right!=null){
           //  String s2=Integer.toString(r.right.val);
            //s=s+"->"+s2;
            
            // s+=Integer.toString(r.right.val);
             p=Integer.toString(r.right.val);
        h(r.right,a,s+"->"+p);
       //  s=s.substring(0,s.length()-s2.length()-2);
        }
    }
}