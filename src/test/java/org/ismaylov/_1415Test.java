package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1415Test {

    private static _1415 task;

    @BeforeEach
    public void setup() {
        task = new _1415();
    }

    @Test
    void getHappyString() {
        assertThat(task.getHappyString(1,3)).isEqualTo("c");
        assertThat(task.getHappyString(1,4)).isEqualTo("");
        assertThat(task.getHappyString(3,9)).isEqualTo("cab");
    }

}