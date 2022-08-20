class Solution {
    //approch: i take a hashmap<char,int> for storing 1st appreaces of each character in string key and the order of ther appreance as value ,
    //then is used a string of type stringbuilder to simly create the requied string form the given message
    //time complexity:o(n) space: o(26) + size of message
    public String decodeMessage(String key, String message) {
        Map<Character,Integer> hm=new HashMap<>();
        int j=0;
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(c!=' ')
            if(!hm.containsKey(c)){
                hm.put(c,j);
                j++;
                }//if
        }//for
        //till now our map is completed
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<message.length();i++){
            char c=message.charAt(i);
            if(c!=' '){
                int p=hm.get(c);
                char d=(char)('a'+p);
                sb.append(d);
            }//if
            else
                sb.append(c);
        }//for
        String s=sb.toString();
        return s;
    }
}