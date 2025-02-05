package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2258Test {

    private static _2258 task;

    @BeforeEach
    public void setup() {
        task = new _2258();
    }

    @Test
    void maximumImportance() {
        assertThat(task.maximumImportance(5, new int[][]{{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}})).isEqualTo(43);
        assertThat(task.maximumImportance(5, new int[][]{{0,3},{2,4},{1,3}})).isEqualTo(20);
    }

}
