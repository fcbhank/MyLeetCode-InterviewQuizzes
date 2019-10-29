package tencent50._237_delete_node_in_a_linked_list;

/**
 * Created by hank on 2019/10/29
 */
class Solution {
    public void deleteNode(ListNode node) {
        // 直接往后移值，由于删除元素不是尾部元素，所以当碰到 next 指向 null时，即可让 pre 指针指向 null
        // 这样就减去了一个元素
        ListNode pre = null;
        while (node != null && node.next != null) {
            pre = node;
            ListNode next = node.next;
            node.val = next.val;
            node = next;
        }
        if (node.next == null) {
            pre.next = null;
        }

    }
}
