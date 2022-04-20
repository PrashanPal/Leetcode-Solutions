/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        ArrayList<TreeNode> ap=new ArrayList<>();
        ArrayList<TreeNode> aq=new ArrayList<>();
        h(root,ap,p);
                h(root,aq,q);
        int lp=ap.size();
        int lq=aq.size();
        for(int i=0;i<lq;i++){
            for(int j=0;j<lp;j++){
                if(ap.get(j)==aq.get(i)){
                    return aq.get(i);
                }//if
            }//for
        }//for
        return null;
    }
    public void h(TreeNode r,ArrayList<TreeNode> a,TreeNode t){
        if(r==null) return;
        if(r==t){
            a.add(r);
            return;
        }
        h(r.left,a,t);
        if(a.size()>0){
            a.add(r);
            return;
        }
         h(r.right,a,t);
        if(a.size()>0){
            a.add(r);
            return;
        }
        return;
    }
}