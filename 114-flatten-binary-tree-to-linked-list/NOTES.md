Not Me: O(1)-solution
This is really brilliant! But flatten() would be unreusable if prev is set to a field. Here's another way of implementing the same idea.
​
public void flatten(TreeNode root) {
flatten(root,null);
}
private TreeNode flatten(TreeNode root, TreeNode pre) {
if(root==null) return pre;
pre=flatten(root.right,pre);
pre=flatten(root.left,pre);
root.right=pre;
root.left=null;
pre=root;
return pre;
}
​
**iterative methode**
it is DFS so u need a stack. Dont forget to set the left child to null, or u'll get TLE. (tricky!)
​
public void flatten(TreeNode root) {
if (root == null) return;
Stack<TreeNode> stk = new Stack<TreeNode>();
stk.push(root);
while (!stk.isEmpty()){
TreeNode curr = stk.pop();
if (curr.right!=null)
stk.push(curr.right);
if (curr.left!=null)
stk.push(curr.left);
if (!stk.isEmpty())
curr.right = stk.peek();
curr.left = null;  // dont forget this!!
}
}