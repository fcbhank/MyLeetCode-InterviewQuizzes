package tencent50.easy._9_palindrome_number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blind_panther
 * @date 2019/11/5 1:01 下午
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // 判断逆序数值是否相等
        List<Long> list = new ArrayList();
        long temp = x;
        while (temp != 0) {
            long num = temp % 10;
            list.add(num);
            temp /= 10;
        }
        // 逆序数
        long reverse = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            reverse += list.get(i) * Math.pow(10, size - i - 1);
        }
        return x == reverse;
    }
}