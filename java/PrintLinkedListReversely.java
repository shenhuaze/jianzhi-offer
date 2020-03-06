package com.huaze.shen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Huaze Shen
 * @date 2020-03-06
 */
public class PrintLinkedListReversely {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[size - i - 1] = list.get(i);
        }
        return result;
    }

    public void demo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        int[] result = reversePrint(head);
        for (int i: result) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        new PrintLinkedListReversely().demo();
    }
}
