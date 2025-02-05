package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _10Test {

    private static _10 task;

    @BeforeEach
    public void setup() {
        task = new _10();
    }

    @Test
    void isMatch() {
        assertThat(task.isMatch("aa", "a")).isFalse();
        assertThat(task.isMatch("aa", "a*")).isTrue();
        assertThat(task.isMatch("ab", ".*")).isTrue();
    }
}