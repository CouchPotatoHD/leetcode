package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3174Test {

    private static _3174 task;

    @BeforeEach
    public void setup() {
        task = new _3174();
    }

    @Test
    void clearDigits() {
        assertThat(task.clearDigits("abc")).isEqualTo("abc");
        assertThat(task.clearDigits("cb34")).isEqualTo("");
    }

}
