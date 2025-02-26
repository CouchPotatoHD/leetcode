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

        int maxResult = nums[0];
        int minResult = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];

        // first run of the Kadane's Algorithm
        for (int i = 1; i < nums.length; i++) {

            maxSum = Math.max(maxSum + nums[i], nums[i]);
            maxResult = Math.max(maxResult, maxSum);

        }

        // second run of the Kadane's Algorithm
        for (int i = 1; i < nums.length; i++) {

            minSum = Math.min(minSum + nums[i], nums[i]);
            minResult = Math.min(minResult, minSum);

        }

        return Math.max(Math.abs(maxResult), Math.abs(minResult));

    }
}