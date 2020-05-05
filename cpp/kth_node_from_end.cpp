#include <iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

ListNode* GetKthFromEnd(ListNode* head, int k) {
    auto left = head;
    auto right = head;
    for (int i = 0; i < k; i++) {
        right = right->next;
    }
    while (right) {
        right = right->next;
        left = left->next;
    }
    return left;
}

int main() {
    auto head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(4);
    head->next->next->next->next = new ListNode(5);
    auto node = GetKthFromEnd(head, 2);
    while (node) {
        cout << node->val << " ";
        node = node->next;
    }
    return 0;
}