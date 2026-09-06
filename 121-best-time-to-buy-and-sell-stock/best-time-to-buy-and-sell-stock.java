class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 0;
        int cheapest = prices[0];
        int maxprofit = 0;
        int profit = 0;
        for (i = 0; i < prices.length; i++) {
            if (prices[i] <= cheapest) {
                cheapest = Math.min(cheapest, prices[i]);
                profit = prices[i] - cheapest;
            } else {
                profit = prices[i] - cheapest;
            }
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
}
