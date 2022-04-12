**optimzed approach  then me**
int sum = 0;
public int sumRootToLeaf(TreeNode root) {
dfs(root,"");
return sum;
}
​
public void dfs(TreeNode root, String curr) {
if(root==null) return;
if(root.right==null && root.left==null)
sum += Integer.parseInt(curr+root.val,2);
dfs(root.right, curr+root.val);
dfs(root.left, curr+root.val);
}