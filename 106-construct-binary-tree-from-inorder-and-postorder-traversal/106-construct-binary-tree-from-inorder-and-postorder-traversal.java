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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<postorder.length;i++){
            hm.put(inorder[i],i);
        }
        return h(0,postorder.length-1,0,postorder.length-1,inorder,postorder,hm);
    }
    public TreeNode h(int ip,int ep,int ii,int ei,int i[],int p[],HashMap<Integer,Integer> hm){
        if(ip>ep||ii>ei) return null;
        TreeNode r=new TreeNode(p[ep]);
        int c=hm.get(r.val)-ii;
        r.right=h(ip+c,ep-1,ii+c+1,ei,i,p,hm);
        r.left=h(ip,ip+c-1,ii,ii+c-1,i,p,hm);
        return r;
    }
}