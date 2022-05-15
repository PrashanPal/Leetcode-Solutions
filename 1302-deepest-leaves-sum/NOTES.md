Complexity
​
Time: O(N), N is the number of nodes in the tree
Space: O(N/2), size of the largest level
Java
​
class Solution {
public int deepestLeavesSum(TreeNode root) {
if (root == null) return 0;
Queue<TreeNode> q = new LinkedList<>();
q.offer(root);
int sum = 0;// This simple trick avoids the use of List<List<Integer>> and saves lot of space
while (!q.isEmpty()) {
int size = q.size();
sum = 0; // Reset for calculating the sum of elements of the next level
while (size-- > 0) {
TreeNode top = q.poll();
sum += top.val;
if (top.left != null) q.offer(top.left);
if (top.right != null) q.offer(top.right);
}
}
return sum;
}
}
​
​
https://leetcode.com/problems/deepest-leaves-sum/discuss/464774/Java-1ms-DFS-single-traversal-O(N)
This one is the best because it uses  * preorder traversal *  ,where leafs having *maximum* *depth *a added only.**