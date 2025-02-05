package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3105Test {

    private static _3105 task;

    @BeforeEach
    public void setup() {
        task = new _3105();
    }

    @Test
    void longestMonotonicSubarray() {
        assertThat(task.longestMonotonicSubarray(new int[]{1,4,3,3,2})).isEqualTo(2);
        assertThat(task.longestMonotonicSubarray(new int[]{3,3,3,3})).isEqualTo(1);
        assertThat(task.longestMonotonicSubarray(new int[]{3,2,1})).isEqualTo(3);
        assertThat(task.longestMonotonicSubarray(new int[]{1,9,7,1})).isEqualTo(3);
    }

}
