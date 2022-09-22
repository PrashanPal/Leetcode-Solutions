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
    //s450-->tree medium --->see striver video
    //approach-->diameter is nothing but the maximum value of (left heigth + right height) of any substree --> therefore we only have to return the maximum value of (lh + rh) 
    //... so this qestion is similar to max hieght of a binarytree
    public int diameterOfBinaryTree(TreeNode root) {
        int max[]={0};//to store maximum value of lh + rh
        findh(root,max);
        return max[0];
    }
    public int findh(TreeNode root,int max[]){
        if(root==null) return 0;
        int l=findh(root.left,max);
        int r=findh(root.right,max);
        max[0]=Math.max(l+r,max[0]);
        return Math.max(l,r)+1;
    }
}