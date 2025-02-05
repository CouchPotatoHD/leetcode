package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _1971Test {

    private static _1971 task;

    @BeforeEach
    public void setup() {
        task = new _1971();
    }

    @Test
    void validPath() {
        assertTrue(task.validPath(3, new int[][]{{0,1}, {1,2}, {2,0}}, 0,2));
        assertFalse(task.validPath(6, new int[][]{{0,1}, {0,2}, {3,5}, {3,5},{5,4}, {4,3}}, 0,5));
        assertTrue(task.validPath(1, new int[][]{}, 0,0));
        assertTrue(task.validPath(10, new int[][]{{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}}, 5,9));

    }

}
