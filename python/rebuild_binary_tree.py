# @author Huaze Shen
# @date 2020-03-07

from typing import List

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


def build_tree(preorder: List[int], inorder: List[int]) -> TreeNode:
    return helper(preorder, 0, len(preorder) - 1, inorder, 0, len(inorder) - 1)


def helper(preorder, pre_start, pre_end, inorder, in_start, in_end):
    """
    递归，基于前序遍历和中序遍历，重建二叉树
    Args:
        preorder: list, 前序遍历数组
        pre_start: int, 当前子树的所有节点在前序遍历数组中最靠左的位置
        pre_end: int, 当前子树的所有节点在前序遍历数组中最靠右的位置
        inorder: list, 中序遍历数组
        in_start: int, 当前子树的所有节点在中序遍历数组中最靠左的位置
        in_end: int, 当前子树的所有节点在中序遍历数组中最靠右的位置
    Returns:
        root: TreeNode, 当前范围的子树的根节点
    """
    if pre_start > pre_end or in_start > in_end:
        return None
    root_val = preorder[pre_start]
    root = TreeNode(root_val)
    pos = in_start
    for i in range(in_start, in_end + 1):
        if inorder[i] == root_val:
            pos = i
            break
    left_subtree_size = pos - in_start
    root.left = helper(preorder, pre_start + 1, pre_start + left_subtree_size, inorder, in_start, pos - 1)
    root.right = helper(preorder, pre_start + left_subtree_size + 1, pre_end, inorder, pos + 1, in_end)
    return root


if __name__ == '__main__':
    # preorder_ = [3, 9, 20, 15, 7]
    # inorder_ = [9, 3, 15, 20, 7]
    preorder_ = [1, 2]
    inorder_ = [2, 1]
    root_ = build_tree(preorder_, inorder_)
    print()
