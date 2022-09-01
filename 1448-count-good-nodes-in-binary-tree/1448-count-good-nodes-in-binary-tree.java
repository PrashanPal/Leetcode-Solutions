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
    //approach: root node is always good, we take a variable m ,m store max val of node till node you have traversed so that you can compare the val of next upcoming node with current max value i.e m 
    // and if val of next node >=m we simple increse the count by 1
    
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        int c[]={1};//as root node is always good;
        check(root,c,root.val);//here root.val is our current max , we dont initialized it with '0' ,because in case of -ve value of root not ,m will be 0 ,but it should be root.val 
        //you can fgiure out this resons we well ,if you dry run the test case provided in the side notes
        return c[0];
    }//good
    public void check(TreeNode node,int[] c,int m){
        if(node==null) return ;
        m=Math.max(m,node.val);
       // System.out.println(m+" ");
        if(node.left!=null){
            if(node.left.val>=m) c[0]+=1;
            check(node.left,c,m);
        }
        if(node.right!=null){
            if(node.right.val>=m) c[0]+=1;
            check(node.right,c,m);
        }//if
    }//check
}//class