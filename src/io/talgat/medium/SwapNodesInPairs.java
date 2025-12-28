package io.talgat.medium;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode first, second;
        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            first = prev.next;
            second = first.next;
            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;
        }
        return dummy.next;
    }
}
