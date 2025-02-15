package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2698Test {

    private static _2698 task;

    @BeforeEach
    public void setup() {
        task = new _2698();
    }

    @Test
    void punishmentNumber() {
        assertThat(task.punishmentNumber(10)).isEqualTo(182);
        assertThat(task.punishmentNumber(37)).isEqualTo(1478);
    }

}
