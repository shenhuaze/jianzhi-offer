#include <iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

ListNode* ReverseList(ListNode* head) {
    if (!head) {
        return head;
    }
    auto dummy = new ListNode(0);
    dummy->next = head;
    auto cur = head;
    while (cur->next) {
        auto temp = cur->next;
        cur->next = temp->next;
        temp->next = dummy->next;
        dummy->next = temp;
    }
    return dummy->next;
}

int main() {
    auto head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(4);
    head->next->next->next->next = new ListNode(5);
    auto node = ReverseList(head);
    while (node) {
        cout << node->val << " ";
        node = node->next;
    }
    return 0;
}