class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) {
            return cost[0];
        }
        int dp[] = new int[cost.length + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length + 1; i++) {
            if (i == cost.length) {
                dp[i] = Math.min(dp[i - 1], dp[i - 2]);
            } else {
                dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
            }
        }
        return dp[cost.length];
    }
}