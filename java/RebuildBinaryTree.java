package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-07
 */
public class RebuildBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int preStart, int preEnd,
                            int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootVal = preorder[preStart];
        int pos = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (rootVal == inorder[i]) {
                pos = i;
                break;
            }
        }
        int leftSubtreeSize = pos - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, pos - 1);
        root.right = helper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, pos + 1, inEnd);
        return root;
    }

    public void demo() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println();
    }

    public static void main(String[] args) {
        new RebuildBinaryTree().demo();
    }
}
