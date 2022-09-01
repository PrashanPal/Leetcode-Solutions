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
class Solution {//
    //approach this one is really a special question --> it use mutiple if else conditions 
    //approach is similar to Symmetric Tree
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null) return null;
        TreeNode r=new TreeNode();
        if(root1==null&&root2!=null) return root2;
        if(root1!=null&&root2==null) return root1;
        else if(root1!=null&&root2!=null){
            r.val=root1.val + root2.val;
            m(root1,root2,r);
        } 
        return r;
    }//mergeTrees
    public void m(TreeNode r1,TreeNode r2,TreeNode r){
        if(r1==null && r2==null) return;
        if(r1.left!=null&&r2.left!=null){
            TreeNode l=new TreeNode();
            l.val=r1.left.val+r2.left.val;
            r.left=l;
            m(r1.left,r2.left,r.left);
        }//if
        else if(r1.left!=null&&r2.left==null){
            r.left=r1.left;
           // return;
        }
         else if(r1.left==null&&r2.left!=null){
            r.left=r2.left;
            //return;
        }
         else if(r1.left==null&&r2.left==null){
            r.left=null;
            //return;
        }
        if(r1.right!=null&&r2.right!=null){
            TreeNode l=new TreeNode();
            l.val=r1.right.val+r2.right.val;
            r.right=l;
            m(r1.right,r2.right,r.right);
        }//if
        else if(r1.right!=null&&r2.right==null){
            r.right=r1.right;
           // return;
        }
         else if(r1.right==null&&r2.right!=null){
            r.right=r2.right;
           // return;
        }
         else if(r1.right==null&&r2.right==null){
            r.right=null;
           // return;
        }
        return;
    }
}