# @author Huaze Shen
# @date 2020-05-05


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def get_kth_from_end(head: ListNode, k: int) -> ListNode:
    left = head
    right = head
    for i in range(k):
        right = right.next
    while right:
        right = right.next
        left = left.next
    return left


if __name__ == '__main__':
    head_ = ListNode(1)
    head_.next = ListNode(2)
    head_.next.next = ListNode(3)
    head_.next.next.next = ListNode(4)
    head_.next.next.next.next = ListNode(5)
    node = get_kth_from_end(head_, 2)
    while node:
        print(node.val)
        node = node.next
