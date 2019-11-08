package tencent50.easy._121_best_time_to_buy_and_sell_stock;

/**
 * @author blind_panther
 * @date 2019/11/8 1:14 下午
 */
public class Solution {
    public int maxProfit(int[] prices) {
        // 记录遍历过程中的最小值
        int min = Integer.MAX_VALUE;
        // 记录遍历过程中的最大值
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int profit = prices[i] - min;
            if (profit > max) {
                max = profit;
            }
        }
        return max;
    }
}