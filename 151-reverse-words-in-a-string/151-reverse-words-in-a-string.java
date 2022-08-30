class Solution {
    // this is method 2: this method is not much efficient as method1 , and complex also 
    //approach: here i dont use string.trim function  , here i have taken two substrings sb for storing final result and string st ,for forming words in a string a and each time on completion of st , i insert st on the 0th position of sb followed by blank space , to seperate two words
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            StringBuilder st=new StringBuilder(""); 
            char c=s.charAt(i);
            if(c!=' '){
                while(i<s.length()&&s.charAt(i)!=' '){
                st.append(String.valueOf(s.charAt(i)));
                    i++;
                }//while
                sb.insert(0,st);
                i--;
            }
            else if(c==' '){
                while(i<s.length()&&s.charAt(i)==' '){
                    i++;
                }//while
                sb.insert(0,String.valueOf(' '));
                i--; 
            }//else if
        }//for
        if(sb.charAt(0)==' ') sb.deleteCharAt(0);
        if(sb.charAt(sb.length()-1)==' ') sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}