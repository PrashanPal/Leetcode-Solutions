//two pointers approach

// Assuming i = 0, j = s.length() - 1;, s is a valid palindrome (as defined in the problem) if

// there is only one pair of i, j such that s.charAt(i) != s.charAt(j)
// after the different pair hit, we try removing i or j, the characters in middle should be a palindrome.
// there is no pair of i, j such that s.charAt(i) != s.charAt(j)
// Java
class Solution{
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }
    
    /* Check is s[i...j] is palindrome. */
    private boolean isPalindrome(String s, int i, int j) {
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    }