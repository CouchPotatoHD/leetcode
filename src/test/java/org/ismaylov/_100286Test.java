package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _100286Test {


    private static _100286 task;

    @BeforeEach
    public void setup() {
        task = new _100286();
    }

    @Test
    void canMakeSquare() {
        assertTrue(task.canMakeSquare(new char[][]{{'B','W','B'},{'B','W','W'},{'B','W','B'}}));
        assertFalse(task.canMakeSquare(new char[][]{{'B','W','B'},{'W','B','W'},{'B','W','B'}}));
        assertTrue(task.canMakeSquare(new char[][]{{'B','W','B'},{'B','W','W'},{'B','W','W'}}));
    }

}
