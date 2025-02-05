package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1800Test {

    private static _1800 task;

    @BeforeEach
    public void setup() {
        task = new _1800();
    }

    @Test
    void maxAscendingSum() {
        assertThat(task.maxAscendingSum(new int[]{10,20,30,5,10,50})).isEqualTo(65);
        assertThat(task.maxAscendingSum(new int[]{10,20,30,40,50})).isEqualTo(150);
        assertThat(task.maxAscendingSum(new int[]{12,17,15,13,10,11,12})).isEqualTo(33);
    }

}
