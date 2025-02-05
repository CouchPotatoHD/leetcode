package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2444Test {

    private static _2444 task;

    @BeforeEach
    public void setup() {
        task = new _2444();
    }

    @Test
    void countSubarrays() {
        assertThat(task.countSubarrays(new int[]{1,3,5,2,7,5}, 1, 5)).isEqualTo(2L);
        assertThat(task.countSubarrays(new int[]{1,1,1,1}, 1, 1)).isEqualTo(10L);
    }

}
