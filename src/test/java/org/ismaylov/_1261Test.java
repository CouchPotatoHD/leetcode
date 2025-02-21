package org.ismaylov;

import org.ismaylov.classes.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _1261Test {

    private static _1261.FindElements task;

    @BeforeEach
    public void setup() {
    }

    @Test
    void findElements() {
        task = new _1261.FindElements(TreeNode.constructTreeFromArray(new Integer[]{-1, null, -1}));
        assertFalse(task.find(1));
        assertTrue(task.find(2));

        task = new _1261.FindElements(TreeNode.constructTreeFromArray(new Integer[]{-1, -1, -1, -1, -1}));

        assertTrue(task.find(1));
        assertTrue(task.find(3));
        assertFalse(task.find(5));

        task = new _1261.FindElements(TreeNode.constructTreeFromArray(new Integer[]{-1, null, -1, -1, null, -1}));

        assertTrue(task.find(2));
        assertFalse(task.find(3));
        assertFalse(task.find(4));
        assertTrue(task.find(5));
    }

}
