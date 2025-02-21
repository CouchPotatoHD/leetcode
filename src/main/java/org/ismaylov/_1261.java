package org.ismaylov;

import org.ismaylov.classes.TreeNode;
import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@LeetCode(
        number = 1261,
        name = "Find Elements in a Contaminated Binary Tree",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Tree", "DFS", "BFS", "Design", "Binary Tree"}
)
public class _1261 {

    static class FindElements {
        private final Set<Integer> values = new HashSet<>();

        public FindElements(TreeNode root) {
            recover(root, 0);
        }

        private void recover(TreeNode node, int val) {
            if (node == null) return;
            node.val = val;
            values.add(val);
            if (Objects.nonNull(node.left)) {
                recover(node.left, 2 * val + 1);
            }
            if (Objects.nonNull(node.right)) {
                recover(node.right, 2 * val + 2);
            }
        }

        public boolean find(int target) {
            return values.contains(target);
        }
    }
}