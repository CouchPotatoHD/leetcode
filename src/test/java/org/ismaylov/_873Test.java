package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _873Test {

    private static _873 task;

    @BeforeEach
    public void setup() {
        task = new _873();
    }

    @Test
    void lenLongestFibSubseq() {
        assertThat(task.lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8})).isEqualTo(5);
        assertThat(task.lenLongestFibSubseq(new int[]{1,3,7,11,12,14,18})).isEqualTo(3);
    }

}
