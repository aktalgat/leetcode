package io.talgat.easy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        m.test();

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode tail = listNode;
        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }
            if (l2 == null) {
                tail.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        return listNode.next;
    }

    private void test() {
        ListNode l4 = new ListNode(4);
        ListNode l2 = new ListNode(2, l4);
        ListNode l1 = new ListNode(1, l2);

        ListNode l24 = new ListNode(4);
        ListNode l23 = new ListNode(3, l24);
        ListNode l21 = new ListNode(1, l23);

        printListNode(l1);
        printListNode(l21);

        ListNode result = mergeTwoLists(l1, l21);
        printListNode(result);
    }

    private void printListNode(ListNode listNode) {
        if (listNode == null) return;
        ListNode l = listNode;
        System.out.println("Print list node:");
        System.out.print("[ ");
        while (l != null) {
            System.out.print(l.val +" ");
            l = l.next;
        }
        System.out.print("]");
        System.out.println("");
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
