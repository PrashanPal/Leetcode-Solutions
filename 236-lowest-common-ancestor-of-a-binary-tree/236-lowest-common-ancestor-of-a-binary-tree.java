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
    
    public TreeNode backtrack(TreeNode root, TreeNode p, TreeNode q) {
        
        // the line below is the most hard to understand
        // for the first level recursion, if p(or q) is exactly the whole tree's root, return the root(because root is the lowest node).
        // for deeper(higher nodes) recursions, it indicates:
        // (1) we find p(or q), which is fine because this node will not be returned(to output) instantly since it belongs to a deeper recursion but will be used for determinations of shallower(lower nodes) recursions
        // (2) we reach the bottom of the tree, terminate the current track instantly and "null" will also be used for shallower recursions' determine statements.
        if (root == null || root == p || root == q)
            return root;
        
        TreeNode left = backtrack(root.left, p, q);
        TreeNode right=backtrack(root.right, p, q);
        
        // determine statements
        
        if (left != null && right != null) // which means p,q exist below different subtrees;
            return root;
        
        return left != null ? left : right; // which means p,q exist below the same subtree;
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return backtrack(root, p, q);
        
    }
}