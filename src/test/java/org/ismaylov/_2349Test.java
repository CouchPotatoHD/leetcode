package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2349Test {

    private static _2349 task;

    @BeforeEach
    public void setup() {
        task = new _2349();
    }

    @Test
    void numberContainers() {

        _2349.NumberContainers obj = new _2349.NumberContainers();
        assertThat(obj.find(10)).isEqualTo(-1);
        obj.change(2, 10);
        obj.change(1, 10);
        obj.change(3, 10);
        obj.change(5, 10);
        assertThat(obj.find(10)).isEqualTo(1);
        obj.change(1, 20);
        assertThat(obj.find(10)).isEqualTo(2);

    }

}
