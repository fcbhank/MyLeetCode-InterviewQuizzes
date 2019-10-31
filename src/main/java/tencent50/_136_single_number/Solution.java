package tencent50._136_single_number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hank on 2019/11/1
 */
public class Solution {
    public int singleNumber(int[] nums) {
        // 公式(a,2b,2c,2d)
        // 2*(a+b+c+d)-(a+2b+2c+2d)=a
        Set<Integer> set = new HashSet<>();
        int after = 0;
        for (int num : nums) {
            after += num;
            set.add(num);
        }
        int before = 0;
        for (Integer integer : set) {
            before += integer;
        }
        return 2 * before - after;
    }
}
