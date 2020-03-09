#include <iostream>
#include <stack>

using namespace std;

class CQueue {
public:
    stack<int> stack1;
    stack<int> stack2;
    int size;
    CQueue() {

    }

    void AppendTail(int value) {
        while (!stack1.empty()) {
            stack2.push(stack1.top());
            stack1.pop();
        }
        stack1.push(value);
        while (!stack2.empty()) {
            stack1.push(stack2.top());
            stack2.pop();
        }
        size += 1;
    }

    int DeleteHead() {
        if (stack1.empty())
            return -1;
        int head = stack1.top();
        size -= 1;
        stack1.pop();
        return head;
    }
};

int main() {
    CQueue* obj = new CQueue();
    obj->AppendTail(1);
    int param_2 = obj->DeleteHead();
    return 0;
}