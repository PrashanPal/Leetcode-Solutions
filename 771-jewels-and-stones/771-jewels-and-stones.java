class Solution {
    public int numJewelsInStones(String J, String S) {
         
        int[] cnt = new int[128];
        for (char c : S.toCharArray())
            cnt[c]++;
        int ans = 0;
        for (char c : J.toCharArray())
            ans += cnt[c];
        return ans;
    }
    
}