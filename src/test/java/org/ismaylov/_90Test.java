package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _90Test {

    private static _90 task;

    @BeforeEach
    public void setup() {
        task = new _90();
    }

    @Test
    void subsetsWithDup() {
        assertThat(task.subsetsWithDup(new int[]{1, 2, 2})).isEqualTo(List.of(new ArrayList<>(), List.of(1), List.of(1, 2), List.of(1, 2, 2), List.of(2), List.of(2, 2)));
        assertThat(task.subsetsWithDup(new int[]{0})).isEqualTo(List.of(new ArrayList<>(), List.of(0)));
        assertThat(task.subsetsWithDup(new int[]{1, 2, 3})).isEqualTo(List.of(new ArrayList<>(), List.of(1), List.of(1, 2), List.of(1, 2, 3), List.of(1, 3), List.of(2), List.of(2, 3), List.of(3)));

    }

}
