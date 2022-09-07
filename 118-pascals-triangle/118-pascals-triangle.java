class Solution {
    //by me
    //approach: two arraylist r and l1 ,r for storing result and l1=r.get(j-1) for creating arraylist l2 , ie jth row of the pascal's tree
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        l.add(1);
        r.add(l);
        int j=0;
        while(j<=numRows-2){
            List<Integer> l1=new ArrayList<>(r.get(j));
            List<Integer> l2=new ArrayList<>();
            l2.add(1);
            for(int i=1;i<l1.size();i++){
                l2.add(l1.get(i)+l1.get(i-1));
            }//for
            l2.add(1);
            r.add(l2);
            j++;
        }//while
        return r;
    }
}