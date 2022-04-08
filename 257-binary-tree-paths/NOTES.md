**method 1: by me**
**obseyved both the methods of mine**
class Solution {
public List<String> binaryTreePaths(TreeNode root) {
List<String> a=new ArrayList<>();
if(root==null){
return a;
}
String s=Integer.toString(root.val);
h(root,a,s);
return a;
}
public void h(TreeNode r,List<String> a,String s){
if(r.left==null&&r.right==null){
String t=s;
a.add(t);
return;
}
if(r.left!=null){
String s1=Integer.toString(r.left.val);
s=s+"->"+s1;
h(r.left,a,s);
s=s.substring(0,s.length()-s1.length()-2);
}
if(r.right!=null){