package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1684Test {

    private static _1684 task;

    @BeforeEach
    public void setup() {
        task = new _1684();
    }

    @Test
    void countConsistentStrings() {
        assertThat(task.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"})).isEqualTo(2);
        assertThat(task.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"})).isEqualTo(7);
        assertThat(task.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"})).isEqualTo(4);
    }

}
