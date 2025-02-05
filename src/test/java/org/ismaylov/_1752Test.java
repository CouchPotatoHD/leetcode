package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1752Test {

    private static _1752 task;

    @BeforeEach
    public void setup() {
        task = new _1752();
    }

    @Test
    void check() {
        assertThat(task.check(new int[]{3,4,5,1,2})).isTrue();
        assertThat(task.check(new int[]{2,1,3,4})).isFalse();
        assertThat(task.check(new int[]{1,2,3})).isTrue();
    }
}
