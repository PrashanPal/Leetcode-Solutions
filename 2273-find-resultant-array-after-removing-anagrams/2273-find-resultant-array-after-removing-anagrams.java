class Solution {
    //this approach is much better then mine
    public List<String> removeAnagrams(String[] words) {
        String temp="";
            List<String>res=new ArrayList<>();
            for(String s:words){
                    char[]arr=s.toCharArray();
                    Arrays.sort(arr);
                    String sorted=new String(arr);
                    if(temp.equals(sorted))continue;
                    else{
                            res.add(s);
                    }
                    temp=sorted;
                   
            }
            return res;
    }
    
}