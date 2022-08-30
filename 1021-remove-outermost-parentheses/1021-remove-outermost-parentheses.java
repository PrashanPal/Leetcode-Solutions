class Solution {
    //strive long sheet
    //this is 2nd solution on the approach just to , decrease the length of code, for easier understand see 1st solutions
    //approach: simple stach based approach , but must understand the imprtance of that single line
    // since it is gives that each string s ,is having valid parenthesis so ,use this flexibity provided by problem setter
    public String removeOuterParentheses(String s) {
        if(s.equals("")) return s;
        int n=s.length();
        StringBuilder sb=new StringBuilder("");
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(') st.push(c);
            i=i+1;
            while(i<n&&st.size()>0){
                char ch=s.charAt(i);
                if(st.size()==1&&ch==')'){//this is the main logical condition 
                    st.pop();
                }//if
                else if(st.size()>=1){
                    if(ch==')'){
                        st.pop();
                    }//if
                   else if(ch=='('){
                        st.push(ch);
                    }
                     sb.append(ch);    
                }//else if
        i++;
        }//while
            i--;
    }//for
        return sb.toString();
    }//fn
}