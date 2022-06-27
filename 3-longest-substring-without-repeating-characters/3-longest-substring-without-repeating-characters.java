class Solution {
    public int lengthOfLongestSubstring(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            ArrayList<Character> a=new ArrayList<>();
            int j=i;
            while(j<s.length()&&!a.contains(s.charAt(j))){
                a.add(s.charAt(j));
                j++;
            }
            c=Math.max(c,j-i);
        }
        return c;
    }
}