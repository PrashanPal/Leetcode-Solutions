class Solution {
public int findBottomLeftValue(TreeNode root) {
Queue<TreeNode> a=new ArrayDeque<>();
Queue<Integer> b=new ArrayDeque<>();
a.add(root);
// b.add(root.val);
h(a,root,b);
return b.remove();
}
public void h(Queue<TreeNode> a,TreeNode r,Queue<Integer> b){
while(a.size()!=0){
int s=a.size();
b=new ArrayDeque<>();
while(s>0){
TreeNode t=a.remove();
b.add(t.val);
if(t.left!=null) a.add(t.left);
if(t.right!=null) a.add(t.right);
s--;
}
}//while
//return b.remove();
}
}