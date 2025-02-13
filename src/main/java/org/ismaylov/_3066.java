package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

@LeetCode(
        number = 3066,
        name = "Minimum Operations to Exceed Threshold Value II",
        level = Level.MEDIUM,
        tags = {"Array", "Heap(Priority Queue)", "Simulation"}
)
public class _3066 {

    public int minOperations(int[] nums, int k) {

        int n = nums.length;
        int resultCount = 0;

        if (n == 1 && nums[0] > k) {
            return resultCount;
        }

        PriorityQueue<Long> cachedNums = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            cachedNums.add((long) nums[i]);
        }

        while (cachedNums.peek() < k) {
            long num = cachedNums.poll();

            cachedNums.add(num * 2 + cachedNums.poll());
            resultCount++;
        }
        return resultCount;
    }
}