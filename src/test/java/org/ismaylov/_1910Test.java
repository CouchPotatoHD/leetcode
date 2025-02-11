package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1910Test {

    private static _1910 task;

    @BeforeEach
    public void setup() {
        task = new _1910();
    }

    @Test
    void removeOccurrences() {
        assertThat(task.removeOccurrences("daabcbaabcbc", "abc")).isEqualTo("dab");
        assertThat(task.removeOccurrences("axxxxyyyyb", "xy")).isEqualTo("ab");
        assertThat(task.removeOccurrences("aabababa", "aba")).isEqualTo("ba");
    }

}
