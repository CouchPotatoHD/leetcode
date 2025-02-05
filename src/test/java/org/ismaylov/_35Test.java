package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _35Test {

    private static _35 task;

    @BeforeEach
    public void setup() {
        task = new _35();
    }

    @Test
    void searchInsert() {
        assertThat(task.searchInsert(new int[]{1,3,5,6}, 5)).isEqualTo(2);
        assertThat(task.searchInsert(new int[]{1,3,5,6}, 2)).isEqualTo(1);
        assertThat(task.searchInsert(new int[]{1,3,5,6}, 7)).isEqualTo(4);
        assertThat(task.searchInsert(new int[]{1,3,5,6}, 0)).isEqualTo(0);
        assertThat(task.searchInsert(new int[]{1}, 2)).isEqualTo(1);
    }

}
