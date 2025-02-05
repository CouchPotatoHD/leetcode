package org.ismaylov;

import org.ismaylov.classes.ListNode;
import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 3217,
        name = "Delete Nodes From Linked List Present in Array",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Linked List"}
)
public class _3217 {

    public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> deleteSet = new HashSet<>();

        for (int num : nums) {
            deleteSet.add(num);
        }

        ListNode currentNode = head;
        ListNode previousNode = null;

        while (currentNode != null) {
            if (deleteSet.contains(currentNode.val)) {

                if (previousNode == null) {
                    head = currentNode.next;
                    currentNode = head;
                } else {
                    previousNode.next = currentNode.next;
                    currentNode = currentNode.next;
                }
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
