# @author Huaze Shen
# @date 2020-06-25

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


def is_sub_structure(A: TreeNode, B: TreeNode) -> bool:
    return (A is not None and B is not None) and (helper(A, B) or is_sub_structure(A.left, B) or is_sub_structure(A.right, B))


def helper(A, B):
    if B is None:
        return True
    if A is None or A.val != B.val:
        return False
    return helper(A.left, B.left) and helper(A.right, B.right)


if __name__ == '__main__':
    A_ = TreeNode(3)
    A_.left = TreeNode(4)
    A_.right = TreeNode(5)
    A_.left.left = TreeNode(1)
    A_.left.right = TreeNode(2)
    B_ = TreeNode(4)
    B_.left = TreeNode(1)
    print(is_sub_structure(A_, B_))
