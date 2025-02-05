package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ismaylov.classes.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _3217Test {

    private static _3217 task;

    @BeforeEach
    public void setup() {
        task = new _3217();
    }

    @Test
    public void modifiedList() {

        ListNode targetNode1 = new ListNode(4, new ListNode(5));
        assertThat(task.modifiedList(new int[]{1, 2, 3},new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))))).isEqualTo(targetNode1);

        ListNode targetNode2 = new ListNode(2, new ListNode(2, new ListNode(2)));
        assertThat(task.modifiedList(new int[]{1},new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(2)))))))).isEqualTo(targetNode2);

        ListNode targetNode3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        assertThat(task.modifiedList(new int[]{5},new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))))).isEqualTo(targetNode3);

        ListNode targetNode4 = new ListNode(1, new ListNode(2));
        assertThat(task.modifiedList(new int[]{3,4},new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))))).isEqualTo(targetNode4);
    }

}
