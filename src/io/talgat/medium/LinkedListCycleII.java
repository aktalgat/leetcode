package io.talgat.medium;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode meet = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                meet = fast;
                break;
            }
        }
        if (meet == null) return null;
        ListNode first = head;
        ListNode second = meet;
        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }
}


