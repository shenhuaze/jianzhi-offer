#include <iostream>
#include <vector>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

TreeNode* Helper(vector<int>& preorder, int pre_start, int pre_end,
                 vector<int>& inorder, int in_start, int in_end) {
    if (pre_start > pre_end || in_start > in_end) {
        return nullptr;
    }
    int root_val = preorder[pre_start];
    auto root = new TreeNode(root_val);
    int pos = in_start;
    for (int i = in_start; i <= in_end; i++) {
        if (inorder[i] == root_val) {
            pos = i;
            break;
        }
    }
    int left_subtree_size = pos - in_start;
    root->left = Helper(preorder, pre_start + 1, pre_start + left_subtree_size, inorder, in_start, pos - 1);
    root->right = Helper(preorder, pre_start + left_subtree_size + 1, pre_end, inorder, pos + 1, in_end);
    return root;
}

TreeNode* BuildTree(vector<int>& preorder, vector<int>& inorder) {
    return Helper(preorder, 0, preorder.size() - 1, inorder, 0, inorder.size() - 1);
}

int main() {
    vector<int> preorder = {3, 9, 20, 15, 7};
    vector<int> inorder = {9, 3, 15, 20, 7};
    auto root = BuildTree(preorder, inorder);
    return 0;
}