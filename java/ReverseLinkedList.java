package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-05
 */
public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        while (cur.next != null) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = dummy.next;
            dummy.next = temp;
        }
        return dummy.next;
    }

    public void demo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode node = reverseList(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        new ReverseLinkedList().demo();
    }
}
