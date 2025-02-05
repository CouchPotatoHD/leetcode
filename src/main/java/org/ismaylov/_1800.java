package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1800,
        name = "Maximum Ascending Subarray Sum",
        level = Level.EASY,
        tags = {"Array"}
)
public class _1800 {

    public int maxAscendingSum(int[] nums) {

        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int currentSum = nums[0];
        int maxSum = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = nums[i];
            }

            if (i == n - 1) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
