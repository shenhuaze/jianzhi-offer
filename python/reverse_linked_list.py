# @author Huaze Shen
# @date 2020-05-05


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def reverse_list(head: ListNode) -> ListNode:
    if head is None:
        return head
    dummy = ListNode(0)
    dummy.next = head
    cur = head
    while cur.next is not None:
        temp = cur.next
        cur.next = temp.next
        temp.next = dummy.next
        dummy.next = temp
    return dummy.next


if __name__ == '__main__':
    head_ = ListNode(1)
    head_.next = ListNode(2)
    head_.next.next = ListNode(3)
    head_.next.next.next = ListNode(4)
    head_.next.next.next.next = ListNode(5)
    node = reverse_list(head_)
    while node:
        print(node.val)
        node = node.next
