package tencent50._344_reverse_string;

/**
 * Created by hank on 2019/10/31
 */
public class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

}
