class Solution {
    //this is mine approach 
    //approach: create a map or blue print for one string and then check that other string satisfies this map or not
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int a[]=new int[s.length()];
        HashMap<Character,Integer> hma=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hma.containsKey(c)){
                int p=hma.size();
                a[i]=p;
                hma.put(c,p);
            }
            else if(hma.containsKey(c)){
                a[i]=hma.get(c);
            }
        }//now our array for string s is complete ,now do the same thing for string t;
        
        int b[]=new int[t.length()];
        HashMap<Character,Integer> hmb=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!hmb.containsKey(c)){
                int m=hmb.size();
                b[i]=m;
                hmb.put(c,m);
            }
            else if(hmb.containsKey(c)){
                b[i]=hmb.get(c);
            }
        }//now our array for string s is complete ,now do the same thing for string t;
        
        //now compare array a and b ,if they are equal retrun true ,other wise return false
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }//for
        return true;
    }
}