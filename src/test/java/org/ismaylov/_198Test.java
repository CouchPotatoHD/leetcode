package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _198Test {

    private static _198 task;

    @BeforeEach
    public void setup() {
        task = new _198();
    }

    @Test
    void islandPerimeter() {

        assertThat(task.rob(new int[]{1,2,3,1})).isEqualTo(4);
        assertThat(task.rob(new int[]{2,7,9,3,1})).isEqualTo(12);

    }
}
