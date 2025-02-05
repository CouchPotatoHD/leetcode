package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1752,
        name = "Check if Array Is Sorted and Rotated",
        level = Level.EASY,
        tags = {"Array"}
)
public class _1752 {
    public boolean check(int[] nums) {

        int len = nums.length;
        if (len == 0) {
            return true;
        }

        int rotatedCount = 0;

        for (int i = 1; i < len; i++) {
            if (nums[i] < nums[i - 1]) {
                rotatedCount++;
            }
        }

        if (nums[0] < nums[len - 1]) {
            rotatedCount++;
        }

        return rotatedCount <= 1;

    }

}
