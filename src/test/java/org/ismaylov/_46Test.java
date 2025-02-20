package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _46Test {

    private static _46 task;

    @BeforeEach
    public void setup() {
        task = new _46();
    }

    @Test
    void permute() {
        assertThat(task.permute(new int[]{1, 2, 3})).isEqualTo(List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)));
        assertThat(task.permute(new int[]{0, 1})).isEqualTo(List.of(List.of(0, 1), List.of(1, 0)));
        assertThat(task.permute(new int[]{1})).isEqualTo(List.of(List.of(1)));

    }

}
