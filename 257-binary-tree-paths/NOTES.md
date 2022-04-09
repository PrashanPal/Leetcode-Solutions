helper(res, root, sb);
return res;
}
private void helper(List<String> res, TreeNode root, StringBuilder sb) {
if(root == null) {
return;
}
int len = sb.length();
sb.append(root.val);
if(root.left == null && root.right == null) {
res.add(sb.toString());
} else {
sb.append("->");
helper(res, root.left, sb);
helper(res, root.right, sb);
}
sb.setLength(len);
}
stringbuilder:
public class Solution {
public List<String> binaryTreePaths(TreeNode root) {
List<String> rst = new ArrayList<String>();
if(root == null) return rst;
StringBuilder sb = new StringBuilder();
helper(rst, sb, root);
return rst;
}
public void helper(List<String> rst, StringBuilder sb, TreeNode root){
if(root == null) return;
int tmp = sb.length();
if(root.left == null && root.right == null){
sb.append(root.val);
rst.add(sb.toString());
sb.delete(tmp , sb.length());
return;
}
sb.append(root.val + "->");
helper(rst, sb, root.left);
helper(rst, sb, root.right);
sb.delete(tmp , sb.length());
return;
}
}