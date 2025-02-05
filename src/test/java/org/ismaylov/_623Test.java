package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ismaylov.classes.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _623Test {

    private static _623 task;

    @BeforeEach
    public void setup() {
        task = new _623();
    }

    @Test
    void sumOfLeftLeaves() {
        TreeNode treeNode1 = TreeNode.constructTreeFromArray(new Integer[]{4,2,6,3,1,5});
        TreeNode treeNode2 = TreeNode.constructTreeFromArray(new Integer[]{4,2,null,3,1});

        assertThat(task.addOneRow(treeNode1, 1, 2)).isNotEqualTo(treeNode1);
        //assertThat(task.sumOfLeftLeaves(treeNode2)).isEqualTo(0);
    }

}
