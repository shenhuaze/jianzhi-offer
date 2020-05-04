#include <iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

ListNode* DeleteNode(ListNode* head, int val) {
    auto dummy = new ListNode(0);
    dummy->next = head;
    auto prev = dummy;
    while (prev->next) {
        if (prev->next->val == val) {
            prev->next = prev->next->next;
            break;
        }
        prev = prev->next;
    }
    return dummy->next;
}

int main() {
    auto head = new ListNode(4);
    head->next = new ListNode(5);
    head->next->next = new ListNode(1);
    head->next->next->next = new ListNode(9);
    DeleteNode(head, 5);
    while (head) {
        cout << head->val << " ";
        head = head->next;
    }
    return 0;
}