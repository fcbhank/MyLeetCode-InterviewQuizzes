package tencent50.easy._169_majority_element;

import java.util.Arrays;

/**
 * @author blind_panther
 * @date 2019/11/2 1:28 下午
 */
public class Solution {
    // 假设数组是非空的，并且给定的数组总是存在众数
    // 排序过后位于中间位置的必定是众数
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];
    }
}
