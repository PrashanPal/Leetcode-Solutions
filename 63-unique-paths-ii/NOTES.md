More explanation:
This is a typical 2D DP problem, we can store value in 2D DP array, but since we only need to use value at dp[i - 1][j] and dp[i][j - 1] to update dp[i][j], we don't need to store the whole 2D table, but instead store value in an 1D array, and update data by using dp[j] = dp[j] + dp[j - 1], (where here dp[j] corresponding to the dp[i - 1][j]) and dp[j - 1] corresponding to the dp[i][j - 1] in the 2D array)
​
An easier way to understand, but more space complexity.