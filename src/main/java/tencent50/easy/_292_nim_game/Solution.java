package tencent50.easy._292_nim_game;


class Solution {
    public boolean canWinNim(int n) {
        // 数学归纳法，要想赢不能是 4 的倍数
        return n % 4 != 0;
    }
}
