package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-04
 */
public class DeleteNodeInLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = prev.next;
        }
        return dummy.next;
    }

    public void demo() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        deleteNode(head, 5);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static void main(String[] args) {
        new DeleteNodeInLinkedList().demo();
    }
}
