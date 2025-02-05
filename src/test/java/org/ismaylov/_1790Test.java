package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1790Test {

    private static _1790 task;

    @BeforeEach
    public void setup() {
        task = new _1790();
    }

    @Test
    void areAlmostEqual() {
        assertThat(task.areAlmostEqual("bank", "kanb")).isTrue();
        assertThat(task.areAlmostEqual("attack", "defend")).isFalse();
        assertThat(task.areAlmostEqual("kelb", "kelb")).isTrue();
        assertThat(task.areAlmostEqual("aa", "ac")).isFalse();
        assertThat(task.areAlmostEqual("caa", "aaz")).isFalse();
    }

}
