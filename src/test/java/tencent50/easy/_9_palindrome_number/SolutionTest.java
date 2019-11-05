package tencent50.easy._9_palindrome_number;

import org.junit.jupiter.api.Test;

/**
 * @author blind_panther
 * @date 2019/11/5 1:12 下午
 */
public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        int num1 = 10;
        System.out.println(solution.isPalindrome(num1));//false

        int num2 = 2147483647;
        System.out.println(solution.isPalindrome(num2));//false
    }
}
