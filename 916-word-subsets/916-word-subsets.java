class Solution {
    //similar to 49 ans 890
    //appraoch use: let w1 is string from words1 and w2 is string from words2 ,then create an int array a1 of size 26 and this array store count of frequency of each character in string w1 ,similarly create an array a2 for string w2 now if frequency of each character in a1 is >= then the frequency of each character in a2 then it means that string w2 is subset of string w1 ,and if similarly all the strings of string array words2 are subset of string w1 then we will say that w1 is a universal string and then add this string w1 in the list of ans
    //let n=length of words2 then space complexity-->n*26  ,and let m be the length of words1 then time complexity will be-->n*m*26 
    
    
   // public List<String> wordSubsets(String[] words1, String[] words2) { 
    
     public List<String> wordSubsets(String[] A, String[] B) {
        int[] count = new int[26], tmp;
        int i;
        for (String b : B) {
            tmp = counter(b);
            for (i = 0; i < 26; ++i)
                count[i] = Math.max(count[i], tmp[i]);
        }
        List<String> res = new ArrayList<>();
        for (String a : A) {
            tmp = counter(a);
            for (i = 0; i < 26; ++i)
                if (tmp[i] < count[i])
                    break;
            if (i == 26) res.add(a);
        }
        return res;
    }

    int[] counter(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) count[c - 'a']++;
        return count;
    }
}//class