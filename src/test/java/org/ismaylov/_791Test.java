package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _791Test {

    private static _791 task;

    @BeforeEach
    public void setup() {
        task = new _791();
    }

    @Test
    void intersection() {
        assertThat(task.customSortString("cba", "abcd")).isEqualTo("cbad");
        assertThat(task.customSortString("bcafg", "abcd")).isEqualTo("bcad");
    }

}