package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1524Test {

    private static _1524 task;

    @BeforeEach
    public void setup() {
        task = new _1524();
    }

    @Test
    void numOfSubarrays() {

        assertThat(task.numOfSubarrays(new int[]{1,3,5})).isEqualTo(4);
        assertThat(task.numOfSubarrays(new int[]{2,4,6})).isEqualTo(0);
        assertThat(task.numOfSubarrays(new int[]{1,2,3,4,5,6,7})).isEqualTo(16);

    }
}