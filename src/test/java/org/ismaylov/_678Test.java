package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _678Test {

    private static _678 task;

    @BeforeEach
    public void setup() {
        task = new _678();
    }

    @Test
    void checkValidString() {
        assertTrue(task.checkValidString("()"));
        assertTrue(task.checkValidString("(*)"));
        assertTrue(task.checkValidString("(*))"));
        assertTrue(task.checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
    }
}
