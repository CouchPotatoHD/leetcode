package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1980Test {

    private static _1980 task;

    @BeforeEach
    public void setup() {
        task = new _1980();
    }

    @Test
    void findDifferentBinaryString() {
        assertThat(task.findDifferentBinaryString(new String[]{"01","10"})).containsAnyOf("00","11");
        assertThat(task.findDifferentBinaryString(new String[]{"00","01"})).containsAnyOf("11", "10");
        assertThat(task.findDifferentBinaryString(new String[]{"111","011","001"})).containsAnyOf("000", "010", "100", "110");
    }

}