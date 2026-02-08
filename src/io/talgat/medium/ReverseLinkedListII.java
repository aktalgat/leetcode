package io.talgat.medium;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii
 */
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode cur = prev.next;
        ListNode move;
        for (int i = 0; i < (right - left); i++) {
            move = cur.next;
            cur.next = move.next;
            move.next = prev.next;
            prev.next = move;
        }
        return dummy.next;
    }
}
