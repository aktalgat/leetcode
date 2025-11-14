package io.talgat.medium;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int d = 0;
        while (fast != null) {
            if (d != n + 1) {
                fast = fast.next;
                d++;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
