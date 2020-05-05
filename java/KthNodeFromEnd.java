package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-05
 */
public class KthNodeFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        for (int i = 0; i < k; i++) {
            right = right.next;
        }
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        return left;
    }

    public void demo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode node = getKthFromEnd(head, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        new KthNodeFromEnd().demo();
    }
}
