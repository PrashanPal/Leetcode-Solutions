https://leetcode.com/problems/binary-search-tree-iterator/discuss/1965051/Daily-LeetCoding-Challenge-April-Day-20
Java-Stack
​
class BSTIterator {
Stack<TreeNode> stack;
public BSTIterator(TreeNode root) {
stack = new Stack<TreeNode>();
fill(root);
}
private void fill(TreeNode node){
while(node!=null){
stack.push(node);
node= node.left;
}
}
public int next() {
TreeNode p = stack.pop();
fill(p.right);
return p.val;
}
public boolean hasNext() {
return !stack.isEmpty();
}
}