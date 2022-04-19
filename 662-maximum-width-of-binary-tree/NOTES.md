int ind=p.i;
TreeNode t=p.t;
if(t.left!=null){
if(ind>0)
//Pair pp=new Pair((ind-1)*2+1,t.left);
q.add(new Pair((ind-1)*2+1,t.left));
else
// Pair pp=new Pair(ind*2+1,t.right);
q.add(new Pair(ind*2+1,t.left));
}//if left
if(t.right!=null){
if(ind>0)
// Pair pp=new Pair((ind-1)*2+2,t.right);
q.add(new Pair((ind-1)*2+2,t.right));
else
// Pair pp=new Pair(ind*2+2,t.right);
q.add(new Pair(ind*2+2,t.right));
}//if right
s--;
}//while
if(q.size()!=0){
Pair p1=q.getFirst();
int ind1=p1.i;
//int ind1=q.getFirst().i;
Pair p2=q.getLast();
int ind2=p2.i;
//int ind2=q.getLast().i;
if((ind2-ind1+1)>b){
b=ind2-ind1+1;
}//if
}// if q
}//while
return b;
}// h
}// class