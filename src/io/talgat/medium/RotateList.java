package io.talgat.medium;

/**
 * https://leetcode.com/problems/rotate-list
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int n = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }
        k %= n;
        if (k == 0) {
            return head;
        }
        tail.next = head;
        int move = n - k;
        ListNode newTail = head;
        for (int i = 1; i < move; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
