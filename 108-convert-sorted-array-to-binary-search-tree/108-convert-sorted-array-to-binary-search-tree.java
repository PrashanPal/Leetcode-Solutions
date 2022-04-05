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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        TreeNode head=h(nums,0,nums.length-1);
        return head;
    }
    
    public TreeNode h(int a[],int l,int r){
        if(l>r){
            return null;
        }
        int m=(l+r)/2;
        TreeNode t=new TreeNode(a[m]);
        t.left=h(a,l,m-1);
        t.right=h(a,m+1,r);
        return t;
    }
}