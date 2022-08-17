class Solution {
    //simple and basic question
    String s[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> h=new HashSet<>();
        for(String e:words){
            int i=0;
            String t="";
            while(i<e.length()){
                char c=e.charAt(i);
                t=t+s[c-'a'];
                i++;
            }//while
            h.add(t);
        }//for
        return h.size();
    }
}