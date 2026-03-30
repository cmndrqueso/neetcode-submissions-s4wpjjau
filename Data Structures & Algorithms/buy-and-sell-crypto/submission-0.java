class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i = 0; i < prices.length - 1; i++) {
          for(int j = prices.length - 1; j > i; j--) {
            maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
          }
        }
        return maxProfit;
    }

    // Two pointer 
    // Profit = sellPrice - buyPrice
    // For each num 
}
