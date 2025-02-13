package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3066Test {

    private static _3066 task;

    @BeforeEach
    public void setup() {
        task = new _3066();
    }

    @Test
    void minOperations() {
        assertThat(task.minOperations(new int[]{2,11,10,1,3}, 10)).isEqualTo(2);
        assertThat(task.minOperations(new int[]{1,1,2,4,9}, 20)).isEqualTo(4);
        assertThat(task.minOperations(new int[]{69,89,57,31,84,97,50,38,91,86}, 91)).isEqualTo(4);
        assertThat(task.minOperations(new int[]{21,35,90,51,27,19,57}, 90)).isEqualTo(4);
        assertThat(task.minOperations(new int[]{999999999,999999999,999999999}, 1000000000)).isEqualTo(2);

    }

}
