class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l=new ArrayList<>();
        int t=0;
        int k=0;
        for(int i=1;i<=n;i++){
            l.add("Push");
            if(i!=target[t]){
                l.add("Pop");
                k=1;
            }//if
            t++;
            if(k==1){
                k=0;
                t--;
            }
            if(t==target.length){
                return l;
            }
        }//for
        return l;
    }
}