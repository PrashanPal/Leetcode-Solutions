class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        int l=needle.length();
        for(int i=0;i<=haystack.length()-l;i++){
            if(haystack.substring(i,i+l).equals(needle)) return i;
        }//for
        return -1;
    }
}