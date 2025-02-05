package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ismaylov.classes.ListNode;
import org.ismaylov.classes.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _1367Test {

    private static _1367 task;

    @BeforeEach
    public void setup() {
        task = new _1367();
    }

    @Test
    void isSubPath() {
        ListNode head1 = new ListNode(4, new ListNode(2, new ListNode(8)));
        TreeNode root1 = TreeNode.constructTreeFromArray(new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3});
        assertThat(task.isSubPath(head1, root1)).isTrue();

        ListNode head2 = new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(6))));
        TreeNode root2 = TreeNode.constructTreeFromArray(new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3});
        assertThat(task.isSubPath(head2, root2)).isTrue();

        ListNode head3 = new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(6, new ListNode(8)))));
        TreeNode root3 = TreeNode.constructTreeFromArray(new Integer[]{1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3});
        assertThat(task.isSubPath(head3, root3)).isFalse();
    }
}