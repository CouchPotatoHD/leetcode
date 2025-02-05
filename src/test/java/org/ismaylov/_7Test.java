package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _7Test {

    private static _7 task;

    @BeforeEach
    public void setup() {
        task = new _7();
    }

    @Test
    void reverse() {
        assertThat(task.reverse(123)).isEqualTo(321);
        assertThat(task.reverse(-123)).isEqualTo(-321);
        assertThat(task.reverse(120)).isEqualTo(21);
    }
}