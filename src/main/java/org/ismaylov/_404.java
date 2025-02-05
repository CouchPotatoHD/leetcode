package org.ismaylov;

import org.ismaylov.classes.TreeNode;
import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 404,
        name = "Sum of Left Leaves",
        level = Level.EASY,
        tags = {"Tree", "Depth-First Search", "Breadth-First Search", "Binary Tree"}
)
public class _404 {

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    public int dfs(TreeNode root, boolean left) {

        if (root == null) return 0;

        if (root.left == null && root.right == null && left) {
            return root.val;
        }

        int leftSum = dfs(root.left, true);
        int rightSum = dfs(root.right, false);

        return leftSum + rightSum;

    }

}
