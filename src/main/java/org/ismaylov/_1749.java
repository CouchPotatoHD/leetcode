package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1749,
        name = "Maximum Absolute Sum of Any Subarray",
        level = Level.MEDIUM,
        tags = {"Array", "Dynamic Programming", "Kadane’s Algorithm"}
)
public class _1749 {

    public int maxAbsoluteSum(int[] nums) {

        int maxSum = 0;
        int minSum = 0;
        int result = 0;

        // only first run of the Kadane's Algorithm
        for (int num : nums) {

            result += num;

            maxSum = Math.max(result, maxSum);
            minSum = Math.min(result, minSum);
        }

        return Math.abs(maxSum - minSum);

    }
}