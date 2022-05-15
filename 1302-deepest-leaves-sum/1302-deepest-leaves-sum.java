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
    public int deepestLeavesSum(TreeNode root) {
        int[] maxDepth = new int[1];
        int[] sumOfDeepestLeaves = new int[1];
        findDepth(root, maxDepth, sumOfDeepestLeaves, 1);
        return sumOfDeepestLeaves[0];
    }
    
    public void findDepth(TreeNode root, int[] maxDepth, int[] sumOfDeepestLeaves, 
                          int currDepth) {
        if(root == null) {
           return; 
        }
        
        if(root.left == null && root.right == null) {
            /** If depth of the current leaf is equal to existing maximum depth, 
                add the value of this leaf to the existing sum of deepest leaves. */
            if(maxDepth[0] == currDepth) {
                sumOfDeepestLeaves[0] += root.val;
                return;
            /** If depth of the current leaf is less than the existing maximum depth,
                dont change the existing sum of deepest leaves and return. */
            } else if(currDepth < maxDepth[0]) {
                return;
            /** If depth of the current leaf is greater than the existing maximum depth,
                set max depth to current depth and also initialize the sum of deepest leaves
                as the current node val */
            } else {
                sumOfDeepestLeaves[0] = root.val;
                maxDepth[0] = currDepth;
                return;
            }
        }
        
        findDepth(root.left, maxDepth, sumOfDeepestLeaves, currDepth+1);
        findDepth(root.right, maxDepth, sumOfDeepestLeaves, currDepth+1);
        return;
    } 
}