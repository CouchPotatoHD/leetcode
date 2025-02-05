package org.ismaylov;

import org.ismaylov.classes.ListNode;
import org.ismaylov.classes.TreeNode;
import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.Objects;

@LeetCode(
        number = 1367,
        name = "Linked List in Binary Tree",
        level = Level.MEDIUM,
        tags = {"Linked List", "Tree", "DFS", "BFS", "Binary Tree"}
)
public class _1367 {

    public boolean isSubPath(ListNode head, TreeNode root) {

        if (root == null) return false;

        return visitLeft(head, root) || visitRight(head, root);
    }

    private boolean visitRight(ListNode head, TreeNode root) {

        if (root == null) {
            return false;
        } else if (dfs(head, root)) {
            return true;
        } else {
            return visitLeft(head, root) || visitRight(head, root);
        }
    }

    private boolean visitLeft(ListNode head, TreeNode root) {

        if (root == null) {
            return false;
        } else if (dfs(head, root)) {
            return true;
        } else {
            return visitLeft(head, root.left) || visitRight(head, root.right);
        }

    }

    private boolean dfs(ListNode head, TreeNode root) {

        if (head == null) {
            return false;
        }
        if (root == null){
            return false;
        }

        if (!Objects.equals(head.val, root.val)) {
            return false;
        }

        if (root.val != head.val) {
            return false;
        }

        return dfs(head.next, root.left) || dfs(head.next, root.right);

    }

}