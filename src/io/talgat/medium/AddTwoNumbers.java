package io.talgat.medium;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = null;
        ListNode prev = null;
        int pr = 0;
        boolean bool = true;
        while (bool) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + pr;
            int res = sum;
            if (sum >= 10) {
                res = sum % 10;
                pr = 1;
            } else {
                pr = 0;
            }
            ListNode ln1 = new ListNode(res);
            if (ln == null) {
                ln = ln1;
            }
            if (prev != null) {
                prev.next = ln1;
            }
            prev = ln1;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if (l1 == null && l2 == null && pr == 0) {
                bool = false;
            }

        }
        return ln;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
