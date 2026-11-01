class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        dp[0] = 0;
        int j = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
        }
        for (int i = 1; i <= amount; i++) {
            for (j = 0; j < coins.length; j++) {
                if (coins[j] > i) {
                    continue;
                }
                dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }
       if(dp[amount]!=Integer.MAX_VALUE-1){
        return dp[amount];
       }else{
        return -1;
       }
    }
}