package tencent50.easy._169_majority_element;

import org.junit.jupiter.api.Test;

/**
 * @author blind_panther
 * @date 2019/11/2 1:33 下午
 */
public class SolutonTest {
    @Test
    public void test() {
        int[] nums1 = {3, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums2));
    }
}
