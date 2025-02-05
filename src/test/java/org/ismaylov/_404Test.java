package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ismaylov.classes.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _404Test {

    private static _404 task;

    @BeforeEach
    public void setup() {
        task = new _404();
    }

    @Test
    void sumOfLeftLeaves() {
        TreeNode treeNode1 = TreeNode.constructTreeFromArray(new Integer[]{3,9,20,null,null,15,7});
        TreeNode treeNode2 = TreeNode.constructTreeFromArray(new Integer[]{1});

        assertThat(task.sumOfLeftLeaves(treeNode1)).isEqualTo(24);
        assertThat(task.sumOfLeftLeaves(treeNode2)).isEqualTo(0);
    }

}
