package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3160Test {

    private static _3160 task;

    @BeforeEach
    public void setup() {
        task = new _3160();
    }

    @Test
    void queryResults() {
        assertThat(task.queryResults(4, new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}})).isEqualTo(new int[]{1, 2, 2, 3});
        assertThat(task.queryResults(4, new int[][]{{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}})).isEqualTo(new int[]{1, 2, 2, 3, 4});
        assertThat(task.queryResults(1, new int[][]{{0,1},{0,4},{0,4},{0,1},{1,2}})).isEqualTo(new int[]{1, 1, 1, 1, 2});
    }

}
