class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='*')
                st.push(c);
            else
                if(st.size()>0) st.pop();
        }//for
        while(st.size()>0){
            sb.insert(0,String.valueOf(st.pop()));
        }
        return sb.toString();
    }
}