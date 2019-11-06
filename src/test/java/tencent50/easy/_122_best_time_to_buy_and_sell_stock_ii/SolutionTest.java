package tencent50.easy._122_best_time_to_buy_and_sell_stock_ii;

import org.junit.jupiter.api.Test;

/**
 * Created by hank on 2019/11/6
 */
public class SolutionTest {
    @Test
    public void test() {
        int[] stock1 = {7, 1, 5, 3, 6, 4};
        int[] stock2 = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(stock1));
        System.out.println(solution.maxProfit(stock2));
    }
}
