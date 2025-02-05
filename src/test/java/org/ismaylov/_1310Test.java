package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1310Test {

    private static _1310 task;

    @BeforeEach
    public void setup() {
        task = new _1310();
    }

    @Test
    void xorQueries() {
        assertThat(task.xorQueries(new int[]{1,3,4,8}, new int[][]{{0,1},{1,2},{0,3},{3,3}})).isEqualTo(new int[]{2,7,14,8});
        assertThat(task.xorQueries(new int[]{4,8,2,10}, new int[][]{{2,3},{1,3},{0,0},{0,3}})).isEqualTo(new int[]{8,0,4,4});
    }

}
