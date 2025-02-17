package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1079Test {

    private static _1079 task;

    @BeforeEach
    public void setup() {
        task = new _1079();
    }

    @Test
    void numTilePossibilities() {
        assertThat(task.numTilePossibilities("AAB")).isEqualTo(8);
        assertThat(task.numTilePossibilities("AAABBC")).isEqualTo(188);
        assertThat(task.numTilePossibilities("V")).isEqualTo(1);
    }

}
