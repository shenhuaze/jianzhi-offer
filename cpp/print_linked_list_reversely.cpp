#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

vector<int> ReversePrint(ListNode* head) {
    vector<int> result;
    while (head) {
        result.push_back(head->val);
        head = head->next;
    }
    reverse(result.begin(), result.end());
    return result;
}

int main() {
    auto head = new ListNode(1);
    head->next = new ListNode(3);
    head->next->next = new ListNode(2);
    vector<int> result = ReversePrint(head);
    for (int val: result) {
        cout << val << " ";
    }
    return 0;
}