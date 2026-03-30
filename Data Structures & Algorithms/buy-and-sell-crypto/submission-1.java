class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 1;
        while(sellDay < prices.length) {
          if(prices[sellDay] > prices[buyDay]) {
            int profit = prices[sellDay] - prices[buyDay];
            maxProfit = Math.max(maxProfit, profit);
          } else {
            buyDay = sellDay;
          }
          sellDay++;
        }
        return maxProfit;
    }

    // Two pointer 
    // Profit = sellPrice - buyPrice
    // For each num 
}
