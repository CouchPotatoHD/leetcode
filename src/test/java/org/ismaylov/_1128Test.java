package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1128Test {

    private static _1128 task;

    @BeforeEach
    public void setup() {
        task = new _1128();
    }

    @Test
    void numEquivDominoPairs() {
        assertThat(task.numEquivDominoPairs(new int[][]{{1,2},{2,1},{3,4},{5,6}})).isEqualTo(1);
        assertThat(task.numEquivDominoPairs(new int[][]{{1,2},{1,2},{1,1},{1,2},{2,2}})).isEqualTo(3);
    }

}