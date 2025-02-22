package org.ismaylov;

import org.ismaylov.classes.TreeNode;
import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.ArrayDeque;
import java.util.Deque;

@LeetCode(
        number = 1028,
        name = "Recover a Tree From Preorder Traversal",
        level = Level.HARD,
        tags = {"String", "Tree", "DFS", "Binary Tree"}
)
public class _1028 {

    public TreeNode recoverFromPreorder(String traversal) {
        Deque<TreeNodeDepth> stack = new ArrayDeque<>();
        int i = 0, n = traversal.length();

        while (i < n) {
            int depth = 0;
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            int value = 0;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                value = value * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(value);
            TreeNodeDepth nodeDepth = new TreeNodeDepth(node, depth);

            while (!stack.isEmpty() && stack.peek().depth >= depth) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                TreeNode parent = stack.peek().node;
                if (parent.left == null) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
            }

            stack.push(nodeDepth);
        }

        while (stack.size() > 1) {
            stack.pop();
        }

        return stack.peek().node;
    }

    private static class TreeNodeDepth {
        TreeNode node;
        int depth;

        TreeNodeDepth(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }


}
