#include <iostream>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

TreeNode* MirrorTree(TreeNode* root) {
    if (!root) {
        return root;
    }
    auto new_root = new TreeNode(root->val);
    new_root->left = MirrorTree(root->right);
    new_root->right = MirrorTree(root->left);
    return new_root;
}

int main() {
    auto root = new TreeNode(4);
    root->left = new TreeNode(2);
    root->right = new TreeNode(7);
    root->left->left = new TreeNode(1);
    root->left->right = new TreeNode(3);
    root->right->left = new TreeNode(6);
    root->right->right = new TreeNode(9);
    auto new_root = MirrorTree(root);
    cout << "";
    return 0;
}
