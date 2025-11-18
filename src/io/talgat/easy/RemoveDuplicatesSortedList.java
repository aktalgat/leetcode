package io.talgat.easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list
 */
public class RemoveDuplicatesSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        while (start != null && start.next != null) {
            if (start.val == start.next.val) {
                start.next = start.next.next;
            } else {
                start = start.next;
            }
        }
        return head;
    }
}
