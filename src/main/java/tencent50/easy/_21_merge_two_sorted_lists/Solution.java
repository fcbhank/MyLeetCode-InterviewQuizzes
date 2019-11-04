package tencent50.easy._21_merge_two_sorted_lists;

/**
 * Created by hank on 2019/11/4
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode head = l1.val <= l2.val ? l1 : l2;
        if (head == l1) {
            // L1 头结点值小
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            // l2 头结点值小
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
