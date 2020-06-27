# @author Huaze Shen
# @date 2020-06-28


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


def mirror_tree(root: TreeNode) -> TreeNode:
    if root is None:
        return root
    new_root = TreeNode(root.val)
    new_root.left = mirror_tree(root.right)
    new_root.right = mirror_tree(root.left)
    return new_root


if __name__ == '__main__':
    root_ = TreeNode(4)
    root_.left = TreeNode(2)
    root_.right = TreeNode(7)
    root_.left.left = TreeNode(1)
    root_.left.right = TreeNode(3)
    root_.right.left = TreeNode(6)
    root_.right.right = TreeNode(9)
    new_root_ = mirror_tree(root_)
    print()
