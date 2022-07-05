class Solution {
    //bruete force approach: create an array and filled it with last index of each character i.e O(n^2) time it takes
    //now elements in this span ,are in one partition
    //another brute force :insted of n^2 ,we can do same thing in n,by using a hashmap ,which contains last index of each character as a value
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!h.containsKey(c)) h.put(c,i);
            else h.put(c,i);
            
        }//for
        int j=0;
        int l=h.get(s.charAt(0));
        // for(char c:h.keySet()){
        //     System.out.print(c+"->"+h.get(c)+" , ");
        // }
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=1;i<s.length();i++){
            if(i<l){
                if(h.get(s.charAt(i))>l){
                    l=h.get(s.charAt(i));
                }
            }
            else if(i>l){
                a.add(l+1-j);         
                j=i;    
                l=h.get(s.charAt(i));
            }//elseif
        }//for
        if(j<=s.length()){
            a.add(s.length()-j); 
        }
        return a;
        
    }
}