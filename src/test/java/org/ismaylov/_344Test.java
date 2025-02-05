package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _344Test {

    private static _344 task;

    @BeforeEach
    public void setup() {
        task = new _344();
    }

    @Test
    void reverseStringOlleh() {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        task.reverseString(s);

        assertThat(s).isEqualTo(new char[]{'o', 'l', 'l', 'e', 'h'});

    }

    @Test
    void reverseStringHannah() {

        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        task.reverseString(s);

        assertThat(s).isEqualTo(new char[]{'h', 'a', 'n', 'n', 'a', 'H'});

    }

}
