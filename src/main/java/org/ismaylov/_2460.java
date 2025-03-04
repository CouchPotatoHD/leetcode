package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 2460,
        name = "Apply Operations to an Array",
        level = Level.EASY,
        tags = {"Array", "Two Pointer", "Simulation"}
)
public class _2460 {

    public int[] applyOperations(int[] nums) {

        int n = nums.length;

        if (n == 2 && nums[0] == 0) {
            nums[0] = nums[1];
            nums[1] = 0;
            return nums;
        }

        int[] targetArray = new int[n];

        for (int i = 0, targetArrayCounter = 0; i < n - 1; i++) {

            int left = nums[i];
            int right = nums[i + 1];

            if (left == right && left > 0) {
                targetArray[targetArrayCounter] = left * 2;
                nums[i + 1] = 0;
                targetArrayCounter++;
            } else if (left > 0) {
                targetArray[targetArrayCounter] = left;
                targetArrayCounter++;
            }

            if (left != right && i + 1 == n - 1) {
                targetArray[targetArrayCounter] = right;
            }
        }
        return targetArray;
    }
}