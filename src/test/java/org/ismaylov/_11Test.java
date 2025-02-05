package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _11Test {

    private static _11 task;

    @BeforeEach
    public void setup() {
        task = new _11();
    }

    @Test
    void maxArea() {
        assertThat(task.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
        assertThat(task.maxArea(new int[]{1, 1})).isEqualTo(1);
    }
}