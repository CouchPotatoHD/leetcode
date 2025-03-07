package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ismaylov.utils.LinkedListUtils.constructListNode;

class _2Test {

    private static _2 task;

    @BeforeEach
    public void setup() {
        task = new _2();
    }

    @Test
    void maxProfit() {
        assertThat(task.addTwoNumbers(constructListNode(2, 4, 3), constructListNode(5, 6, 4)))
                .isEqualTo(constructListNode(7, 0, 8));
        assertThat(task.addTwoNumbers(constructListNode(0), constructListNode(0)))
                .isEqualTo(constructListNode(0));
        assertThat(task.addTwoNumbers(constructListNode(9, 9, 9, 9, 9, 9, 9), constructListNode(9, 9, 9, 9)))
                .isEqualTo(constructListNode(8, 9, 9, 9, 0, 0, 0, 1));
    }

}