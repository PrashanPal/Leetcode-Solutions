class Solution {
    //i am using quite complex appraoch here
        //approach: to chech that string a and string b are anagram or not ,i will crate a hashmap<char,int> ha to count frequency of each character in string a ,similarly i will create hashmap<char,int> hb to count frequency of each character in string b, now if ha.size==hb.size and hb contanis each key of ha such that frequency of each key is eaqual in both in ha and hb ,then we say that both the strings are anagram
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<HashMap<Character,Integer>> a=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            HashMap<Character,Integer> hm=new HashMap<>();
            for(int k=0;k<s.length();k++){
                Character c=s.charAt(k);
                if(!hm.containsKey(c)) hm.put(c,1);
                else if(hm.containsKey(c)) hm.put(c,hm.get(c)+1);
            }//for
            a.add(hm);
        }//for ,now our arraylist of hashmap is ready with respective to index of strings in string array
        //now its time to crate list of string
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            ArrayList<String> t=new ArrayList<>();
            if(strs[i]!="A")
                for(int j=i+1;j<strs.length;j++){
                    if(strs[j]!="A"){
                        //now if hashi and hashj are equal or not
                        if(a.get(i).size()==a.get(j).size()){//to compare size of both the hashmaps
                            if(check(a.get(i),a.get(j))){
                                t.add(strs[j]);
                                strs[j]="A";//it is used to mark it visited                      }
                        }//if
                    }//if
                }//if
                }//for j
            if(strs[i]!="A"){
                t.add(strs[i]);
                strs[i]="A";
                 ans.add(t);
            }//if
          //  ans.add(t);
            }//for i
        return ans;
        }//main
    public boolean check(HashMap<Character,Integer> hmi ,HashMap<Character,Integer> hmj){
        for(Character c:hmi.keySet()){
          if(!hmj.containsKey(c)||hmi.get(c)!=hmj.get(c))
              return false;
    }//for
    return true;
    }//check funtion
    }//class
