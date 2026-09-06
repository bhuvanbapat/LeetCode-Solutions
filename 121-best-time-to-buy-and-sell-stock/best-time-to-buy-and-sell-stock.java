class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            cheapest = Math.min(cheapest, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - cheapest);
        }
        return maxProfit;
    }
}