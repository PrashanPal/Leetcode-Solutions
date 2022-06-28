class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        if(name.length()>typed.length()) return false;
        while(i<name.length()){
            if(j==typed.length()) return false;
            int k=0;
            if(i<name.length()&&j<typed.length()&&name.charAt(i)!=typed.charAt(j)) return false;
            if(i<name.length()-1&&name.charAt(i)==name.charAt(i+1)){
                k=1;
                while(i<name.length()-1&&name.charAt(i)==name.charAt(i+1)){
                    k++;
                    i++;
                }//while
            }//if
            int c=0;
            if(i<name.length()&&j<typed.length()&&name.charAt(i)==typed.charAt(j)){
                while(i<name.length()&&j<typed.length()&&name.charAt(i)==typed.charAt(j)){
                    j++;
                    c++;
                }//while
            }//if
            if(k>c) return false;
            i++;
        }
        if(j<typed.length()) return false;
        return true;
    }
}