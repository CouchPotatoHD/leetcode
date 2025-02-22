package org.ismaylov;

import org.ismaylov.classes.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1028Test {

    private static _1028 task;
    private static TreeNode root1;
    private static TreeNode root2;
    private static TreeNode root3;

    @BeforeEach
    public void setup() {
        task = new _1028();

        root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(5);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(5);
        root2.left.left = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.right.left = new TreeNode(6);
        root2.right.left.left = new TreeNode(7);

        root3 = new TreeNode(1);
        root3.left = new TreeNode(401);
        root3.left.left = new TreeNode(349);
        root3.left.left.left = new TreeNode(90);

        root3.left.right = new TreeNode(88);
    }

    @Test
    void recoverFromPreorderTest() {
        TreeNode root1Test = task.recoverFromPreorder("1-2--3--4-5--6--7");
        assertTreeEquals(root1Test, root1);

        TreeNode root2Test = task.recoverFromPreorder("1-2--3---4-5--6---7");
        assertTreeEquals(root2Test, root2);

        TreeNode root3Test = task.recoverFromPreorder("1-401--349---90--88");
        assertTreeEquals(root3Test, root3);

    }

    private void assertTreeEquals(TreeNode expected, TreeNode actual) {
        if (expected == null || actual == null) {
            assertThat(actual).isEqualTo(expected);
            return;
        }
        assertThat(actual.val).isEqualTo(expected.val);
        assertTreeEquals(expected.left, actual.left);
        assertTreeEquals(expected.right, actual.right);
    }

}