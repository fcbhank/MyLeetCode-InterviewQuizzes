package tencent50.easy._121_best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.Test;

/**
 * @author blind_panther
 * @date 2019/11/8 1:21 下午
 */
public class SolutionTest {
    @Test
    public void test() {
        int[] arr1 = new int[]{7, 1, 5, 3, 6, 4};
        int[] arr2 = new int[]{7, 6, 4, 3, 1};

        Solution solution = new Solution();
        System.out.println(solution.maxProfit(arr1));
        System.out.println(solution.maxProfit(arr2));
    }
}
