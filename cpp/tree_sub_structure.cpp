#include <iostream>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

bool Helper(TreeNode* A, TreeNode* B) {
    if (!B) {
        return true;
    }
    if (!A || A->val != B->val) {
        return false;
    }
    return Helper(A->left, B->left) && Helper(A->right, B->right);
}

bool IsSubStructure(TreeNode* A, TreeNode* B) {
    return (A && B) && (Helper(A, B) || IsSubStructure(A->left, B) || IsSubStructure(A->right, B));
}

int main() {
    auto A = new TreeNode(3);
    A->left = new TreeNode(4);
    A->right = new TreeNode(5);
    A->left->left = new TreeNode(1);
    A->left->right = new TreeNode(2);
    auto B = new TreeNode(4);
    B->left = new TreeNode(1);
    cout << IsSubStructure(A, B);
    return 0;
}
