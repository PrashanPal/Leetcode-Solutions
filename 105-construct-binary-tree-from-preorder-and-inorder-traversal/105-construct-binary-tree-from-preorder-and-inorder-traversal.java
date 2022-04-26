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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int end=preorder.length-1;
        return h(preorder,inorder,0,end,0,end);
    }
    public TreeNode h(int p[],int i[],int ip,int ep,int iin,int ein){
        if(ip>ep||iin>ein) return null;
        TreeNode r=new TreeNode(p[ip]);
        int t=iin;
        int c=0;
        while(i[t]!=p[ip]){
            t++;
            c++;
        }
        r.left=h(p,i,ip+1,ip+c,iin,iin+c-1);
        r.right=h(p,i,ip+c+1,ep,iin+c+1,ein);
        return r;
    }
}