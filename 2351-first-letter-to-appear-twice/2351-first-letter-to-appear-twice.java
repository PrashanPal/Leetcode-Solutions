class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!h.contains(s.charAt(i)))
                h.add(s.charAt(i));
            else return s.charAt(i);
        }//for
        return 'a';
    }//fn
}//class