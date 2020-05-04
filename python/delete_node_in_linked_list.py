# @author Huaze Shen
# @date 2020-05-04


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def delete_node(head: ListNode, val: int) -> ListNode:
    dummy = ListNode(0)
    dummy.next = head
    prev = dummy
    while prev.next:
        if prev.next.val == val:
            prev.next = prev.next.next
            break
        prev = prev.next
    return dummy.next


if __name__ == '__main__':
    head_ = ListNode(4)
    head_.next = ListNode(5)
    head_.next.next = ListNode(1)
    head_.next.next.next = ListNode(9)
    delete_node(head_, 5)
    while head_:
        print(head_.val)
        head_ = head_.next
