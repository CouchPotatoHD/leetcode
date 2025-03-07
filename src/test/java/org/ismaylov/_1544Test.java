package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1544Test {

    private static _1544 task;

    @BeforeEach
    public void setup() {
        task = new _1544();
    }

    @Test
    void makeGood() {
        assertThat(task.makeGood("leEeetcode")).isEqualTo("leetcode");
        assertThat(task.makeGood("abBAcC")).isEqualTo("");
        assertThat(task.makeGood("s")).isEqualTo("s");
    }

}
