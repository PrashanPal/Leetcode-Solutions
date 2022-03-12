betichod h:
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
Complexity
​
Time: O(j+s), where j is length of string J and s is the length of string S
Space: O(1)