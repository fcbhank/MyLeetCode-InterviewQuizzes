package tencent50.easy._557_reverse_words_in_a_string_iii;

/**
 * @author blind_panther
 * @date 2019/10/31 下午1:08
 */
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String buffer = "";
        for (String word : words) {
            buffer += reverseAWord(word) + " ";
        }
        int pos = buffer.length() - 1;
        String finalStr = buffer.substring(0, pos);
        return finalStr;
    }

    public String reverseAWord(String word) {
        int len = word.length();
        char[] chars = word.toCharArray();
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
