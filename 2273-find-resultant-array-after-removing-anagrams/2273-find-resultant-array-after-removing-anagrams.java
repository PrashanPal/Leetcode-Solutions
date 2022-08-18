class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> l=new ArrayList<>();
        for(String e:words){
            l.add(e);
        }//for
        int i=1;
        while(i<l.size()){
            if(check(l.get(i),l.get(i-1))){
                l.remove(i);
                i=1;
            }//if
            else
            i++;
        }//while
        return l;
    }//fn
          public boolean check(String s, String t) {
        //using hashmap
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(h.containsKey(c))
                h.put(c,h.get(c)+1);
            else
                h.put(c,1);
        }
        boolean b=true;
       for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(h.containsKey(c))
                h.put(c,h.get(c)-1);
           else
               b=false;
        }//for
            
            for(Character i:h.keySet()){
                if(h.get(i)!=0){
                     b=false;
                }//if
            }//for
        // if(h.size()=0){
        //     b=false;
        // }
            return b;
    }//check
}