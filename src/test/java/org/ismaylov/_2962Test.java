package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _2962Test {

    private static _2962 task;

    @BeforeEach
    public void setup() {
        task = new _2962();
    }

    @Test
    void countSubarrays() {
        assertThat(task.countSubarrays(new int[]{1, 3, 2, 3, 3}, 2)).isEqualTo(6L);
        assertThat(task.countSubarrays(new int[]{1, 4, 2, 1}, 3)).isEqualTo(0L);
            assertThat(task.countSubarrays(new int[]{-1, -4, -2, -1}, 2)).isEqualTo(0L);
        assertThat(task.countSubarrays(new int[]{61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82}, 2)).isEqualTo(224L);
    }
}
