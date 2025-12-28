package io.talgat.medium;

/**
 * https://leetcode.com/problems/swapping-nodes-in-a-linked-list
 */
public class SwappingNodesInLinkedList {

    public ListNode swapNodes(ListNode head, int k) {
        int n = 1;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            n++;
        }
        node = head;
        int i = 1;
        ListNode first = null, second = null;
        while (node != null) {
            if (i == k) {
                first = node;
            }
            if (i == n - k + 1) {
                second = node;
            }
            node = node.next;
            i++;
        }
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;

        return head;
    }
}
