/**
 * 121. 买卖股票的最佳时机
 */
public class $121 {


    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) continue;
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }


    public int maxProfit1(int[] prices) {
        int profit = 0;
        int minDay = prices[0];
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - minDay);
            minDay = Math.min(minDay, prices[i]);
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;
        int minDay = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (profit < prices[i] - minDay)
                profit = prices[i] - minDay;
            if (minDay > prices[i])
                minDay = prices[i];
        }
        return profit;
    }

    // 2 6 1 3
}
