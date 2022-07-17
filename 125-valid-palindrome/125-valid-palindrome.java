class Solution {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); 
        //here [^ is used ,which is ued for negatiion] i.e replace character by "" if it not belongs to [A-Za-z0-9]
        //now our string is ready so ,simply check it using two pointers approach
        int i=0,j=actual.length()-1;
        while(i<j){
            if(j>=0&&i>=0)
            if(actual.charAt(i)!=actual.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}