package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ismaylov.classes.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _1038Test {
    private static _1038 task;

    @BeforeEach
    public void setup() {
        task = new _1038();
    }

    @Test
    void bstToGst() {
        assertThat(task.bstToGst(TreeNode.constructTreeFromArray(new Integer[]{4,1,6,0,2,5,7,null,null,null,3,null,null,null,8})));
        assertThat(task.bstToGst(TreeNode.constructTreeFromArray(new Integer[]{4,1,7,0,2,5,8,null,null,null,3,null,6,null,9})));

        assertThat(task.bstToGst(TreeNode.constructTreeFromArray(new Integer[]{0,null,1})));
    }
}
