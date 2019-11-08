package tencent50.easy._217_contains_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author blind_panther
 * @date 2019/11/8 1:32 下午
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set 自动去重，判断前后的长度即可
        Set<Integer> set = new HashSet();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        return !(set.size() == len);
    }
}
