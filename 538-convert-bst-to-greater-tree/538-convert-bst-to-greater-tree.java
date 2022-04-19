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

    //static int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
       
        int sum[]=new int[1];
        sum[0]=0;
         convert(root,sum);
        return root;
    }
    
    public void convert(TreeNode cur,int sum[]) {
        if (cur == null) return;
        convert(cur.right,sum);
        cur.val += sum[0];
        sum[0] = cur.val;
        convert(cur.left,sum);
    }
    
}