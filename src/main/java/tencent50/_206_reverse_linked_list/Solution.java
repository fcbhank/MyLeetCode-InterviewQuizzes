package tencent50._206_reverse_linked_list;

/**
 * Created by hank on 2019/10/31
 */
public class Solution {
    // 迭代法
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;

        ListNode pre = null;
        ListNode current = head;
        ListNode next = current.next;
        while (next != null) {
            current.next = pre;
            pre = current;
            current = next;
            next = current.next;
        }
        current.next = pre;
        return current;
    }
}
