package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _514Test {

    private static _514 task;

    @BeforeEach
    public void setup() {
        task = new _514();
    }

    @Test
    void islandPerimeter() {

        assertThat(task.findRotateSteps("godding", "gd")).isEqualTo(4);
        assertThat(task.findRotateSteps("godding", "godding")).isEqualTo(13);

    }

}
