. Two combinations are unique if the frequency of at least one of the chosen numbers is different.-- itmeans--2,2,3 is same as 232.
​
for(int i=j;i<a.length;i++){
l.add(a[i]);
h(lr,a,l,t-a[i],i);// not i + 1 because we can reuse same elements
l.remove(l.size()-1);//very important
} //for