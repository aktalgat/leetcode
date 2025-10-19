package io.talgat.easy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        m.test();

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(0);
        ListNode tail = listNode;
        while (true) {
            if (list1 == null) {
                tail.next = list2;
                break;
            }
            if (list2 == null) {
                tail.next = list1;
                break;
            }
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        return listNode.next;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
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
