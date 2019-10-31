package tencent50._206_reverse_linked_list;

/**
 * Created by hank on 2019/10/31
 */
public class Solution2 {
    // 递归法
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        // 当前头结点
        ListNode currentHead = reverseList(head.next);
        // 最后要返回的头结点
        ListNode finalHead = currentHead;
        // 找到 head 要加入的位置：最后一个元素与 null 之间
        while (currentHead.next != null) {
            currentHead = currentHead.next;
        }
        head.next = null;
        // 此时 curentHead 位置即为最后一个元素位置
        currentHead.next = head;
        return finalHead;
    }
}
