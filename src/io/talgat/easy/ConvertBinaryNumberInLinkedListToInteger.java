package io.talgat.easy;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer
 */
public class ConvertBinaryNumberInLinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return !sb.isEmpty() ? Integer.parseInt(sb.toString(), 2) : 0;
    }

    // Java bit operation
    public int getDecimalValue2(ListNode head) {
        int result = 0;
        while (head != null) {
            result = (result << 1) | head.val;
            head = head.next;
        }
        return result;
    }
}
