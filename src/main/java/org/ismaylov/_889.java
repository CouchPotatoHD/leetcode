package org.ismaylov;

import org.ismaylov.classes.TreeNode;
import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1028,
        name = "Construct Binary Tree from Preorder and Postorder Traversal",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Divide and Conquer", "Tree", "Binary Tree"}
)
public class _889 {

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder, postorder, 0, preorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] postorder, int preorderIndexStart, int preorderIndexEnd, int postOrderIndexStart, int postOrderIndexEnd) {

        if (preorderIndexStart > preorderIndexEnd) return null;
        // case new int[]{4, 2, 1, 3}, new int[]{3, 1, 2, 4}
        // case new int[]{2, 1, 3}, new int[]{3, 1, 2}
        if (preorderIndexStart == preorderIndexEnd) return new TreeNode(preorder[preorderIndexStart]);

        TreeNode root = new TreeNode(preorder[preorderIndexStart]);

        int leftSize = getLeftSubtreeSize(preorder, postorder, preorderIndexStart, postOrderIndexStart);

        root.left = buildLeftSubtree(preorder, postorder, preorderIndexStart, postOrderIndexStart, leftSize);
        root.right = buildRightSubtree(preorder, postorder, preorderIndexStart, preorderIndexEnd, postOrderIndexStart, postOrderIndexEnd, leftSize);

        return root;
    }

    private int getLeftSubtreeSize(int[] preorder, int[] postorder, int preStart, int postStart) {
        int leftRootVal = preorder[preStart + 1];
        int leftRootIndex = postStart;

        while (postorder[leftRootIndex] != leftRootVal) leftRootIndex++;

        return leftRootIndex - postStart + 1;
    }

    private TreeNode buildLeftSubtree(int[] preorder, int[] postorder, int preorderIndexStart, int postOrderIndexStart, int leftSize) {
        return buildTree(
                preorder,
                postorder,
                preorderIndexStart + 1,
                preorderIndexStart + leftSize,
                postOrderIndexStart,
                postOrderIndexStart + leftSize - 1
        );
    }

    private TreeNode buildRightSubtree(int[] preorder, int[] postorder, int preorderIndexStart, int preorderIndexEnd, int postOrderIndexStart, int postOrderIndexEnd, int leftSize) {
        return buildTree(
                preorder,
                postorder,
                preorderIndexStart + leftSize + 1,
                preorderIndexEnd,
                postOrderIndexStart + leftSize,
                postOrderIndexEnd - 1
        );
    }
}