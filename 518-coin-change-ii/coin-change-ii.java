class Solution {
    public int change(int amount, int[] coins) {
        int dp[] = new int[amount + 1];
        int i = 0, j = 0;
        dp[0] = 1;
        for (i = 0; i < coins.length; i++) {
            for (j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}