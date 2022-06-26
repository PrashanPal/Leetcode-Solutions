class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int l=Integer.MAX_VALUE;
        String a=strs[0];
        for(int i=1;i<strs.length;i++){
            String b=strs[i];
            int j=0;
            while(j<a.length()&&j<b.length()&&a.charAt(j)==b.charAt(j)){
                j++;
            }
            l=Math.min(j,l);
        }//for
        return a.substring(0,l);
    }
}