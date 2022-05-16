**must do is ,very important question**
https://leetcode.com/problems/subtree-of-another-tree/discuss/102724/Java-Solution-tree-traversal
Nice,
If assum m is the number of nodes in the 1st tree and n is the number of nodes in the 2nd tree, then
Time complexity: O(m*n), worst case: for each node in the 1st tree, we need to check if isSame(Node s, Node t). Total m nodes, isSame(...) takes O(n) worst case
Space complexity: O(height of 1str tree)(Or you can say: O(m) for worst case, O(logm) for average case)
​
public boolean isSubtree(TreeNode s, TreeNode t) {
Queue<TreeNode> nodes = new ArrayDeque<>();
nodes.offer(s);
while (!nodes.isEmpty()) {
TreeNode node = nodes.poll();
if (isSameTree(node, t)) {
return true;
}
if (node.left != null) {
nodes.offer(node.left);
}
if (node.right != null) {
nodes.offer(node.right);
}
}
return false;
}
​
public boolean isSameTree(TreeNode s, TreeNode t) {
if (s == null && t == null) {
return true;
}
if (s == null || t == null) {
return false;
}
if (s.val != t.val) {
return false;
} else {
return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
}
}
​