package tencent50.easy._122_best_time_to_buy_and_sell_stock_ii;

/**
 * Created by hank on 2019/11/6
 */
public class Solution {
    public int maxProfit(int[] prices) {
        // 贪心求解
        int length = prices.length;
        if (length <= 1) {
            // 如果数组个数为0或1，那么最大利润为0
            return 0;
        }
        int profit = 0;
        for (int i = 0; i < length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
