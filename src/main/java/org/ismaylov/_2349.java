package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@LeetCode(
        number = 3151,
        name = "Design a Number Container System",
        level = Level.MEDIUM,
        tags = {"Hash Table", "Design", "Heap", "Ordered Set"}
)
public class _2349 {

    static class NumberContainers {

        private final Map<Integer, Integer> numbers;
        private final Map<Integer, PriorityQueue<Integer>> queueMap;


        public NumberContainers() {
            numbers = new HashMap<>();
            queueMap = new HashMap<>();
        }

        public void change(int index, int number) {
            // for each number we have a priority queue of indexes, first one is the lowest
            queueMap.computeIfAbsent(number, key -> new PriorityQueue<>()).add(index);
            numbers.put(index, number);
        }

        public int find(int number) {

            int result = -1;

            if (!queueMap.containsKey(number)) {
                return result;
            }

            PriorityQueue<Integer> queue = queueMap.get(number);
            // for each index we're trying to get the number that is specified in find
            while (!queue.isEmpty()) {

                int index = queue.peek();

                if (numbers.get(index) == number) {
                    result = index;
                    return result;
                }

                // if no number match - then we don't have a number under that index that is is the queue and it needs to be deleted
                queue.poll();
            }

            return result;

        }
    }
}