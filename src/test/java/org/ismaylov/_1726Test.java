package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1726Test {

    private static _1726 task;

    @BeforeEach
    public void setup() {
        task = new _1726();
    }

    @Test
    void tupleSameProduct() {
        assertThat(task.tupleSameProduct(new int[]{2,3,4,6})).isEqualTo(8);
        assertThat(task.tupleSameProduct(new int[]{1,2,4,5,10})).isEqualTo(16);
        assertThat(task.tupleSameProduct(new int[]{2,3,4,6,8,12})).isEqualTo(40);
        assertThat(task.tupleSameProduct(new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192})).isEqualTo(1288);
    }

}
