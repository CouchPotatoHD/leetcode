package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2342Test {

    private static _2342 task;

    @BeforeEach
    public void setup() {
        task = new _2342();
    }

    @Test
    void maximumSum() {
        assertThat(task.maximumSum(new int[]{18,43,36,13,7})).isEqualTo(54);
        assertThat(task.maximumSum(new int[]{10,12,19,14})).isEqualTo(-1);
        assertThat(task.maximumSum(new int[]{4,6,10,6})).isEqualTo(12);
    }

}
