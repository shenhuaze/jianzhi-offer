# @author Huaze Shen
# @date 2020-03-06

from typing import List


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def reverse_print(head: ListNode) -> List[int]:
    temp = []
    while head is not None:
        temp.append(head.val)
        head = head.next
    result = [i for i in reversed(temp)]
    return result


if __name__ == '__main__':
    head_ = ListNode(1)
    head_.next = ListNode(3)
    head_.next.next = ListNode(2)
    print(reverse_print(head_))
