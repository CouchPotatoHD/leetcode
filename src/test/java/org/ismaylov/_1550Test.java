package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1550Test {

    private static _1550 task;

    @BeforeEach
    public void setup() {
        task = new _1550();
    }

    @Test
    void threeConsecutiveOdds() {
        assertThat(task.threeConsecutiveOdds(new int[]{2,6,4,1})).isEqualTo(false);
        assertThat(task.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12})).isEqualTo(true);
        assertThat(task.threeConsecutiveOdds(new int[]{1,2,1,1})).isEqualTo(false);
        assertThat(task.threeConsecutiveOdds(new int[]{102,780,919,897,901})).isEqualTo(true);
    }

}
