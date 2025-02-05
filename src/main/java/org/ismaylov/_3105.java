package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 3105,
        name = "Longest Strictly Increasing or Strictly Decreasing Subarray",
        level = Level.EASY,
        tags = {"Array"}
)
public class _3105 {

    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        int lenIncreasing = 1;
        int lenDecreasing = 1;

        int startIncreasing = 0;
        int startDecreasing = 0;


        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                lenIncreasing = Math.max(i - startIncreasing + 1, lenIncreasing);
            } else {
                startIncreasing = i;
            }

            if (nums[i] < nums[i - 1]) {
                lenDecreasing = Math.max(i - startDecreasing + 1, lenDecreasing);
            } else {
                startDecreasing = i;
            }
        }

        return Math.max(lenIncreasing, lenDecreasing);
    }

}
