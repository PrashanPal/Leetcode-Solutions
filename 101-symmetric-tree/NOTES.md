**awesome**
public boolean isSymmetric(TreeNode root) {
return root==null || isSymmetricHelp(root.left, root.right);
}
​
private boolean isSymmetricHelp(TreeNode left, TreeNode right){
if(left==null || right==null)//  tricky one
return left==right;//it can only compares here null condition
if(left.val!=right.val)
return false;
return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
}