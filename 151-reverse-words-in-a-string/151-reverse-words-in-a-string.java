class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");// i dont understand clearly about this line please                                                        inspect it
String out = "";
for (int i = parts.length - 1; i > 0; i--) {
    out += parts[i] + " ";
}
return out + parts[0];
    }
}