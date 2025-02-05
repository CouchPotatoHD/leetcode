package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 2962,
        name = "Count Subarrays Where Max Element Appears at Least K Times",
        level = Level.MEDIUM,
        tags = {"Array", "Sliding Window"}
)
public class _2962 {
    public long countSubarrays(int[] nums, int k) {

        int numsLength = nums.length;
        int maxNum = maxNumber(nums);
        int[] prefixes = new int[maxNum+1];

        int windowPositionStart = 0;
        long result = 0;

        for (int windowPositionEnd = 0; windowPositionEnd < numsLength; windowPositionEnd++) {
            prefixes[nums[windowPositionEnd]]++;

            while (prefixes[maxNum] >= k){

                result += numsLength - windowPositionEnd;
                prefixes[nums[windowPositionStart]]--;
                windowPositionStart++;

            }

        }

        return result;

    }

    int maxNumber(int[] nums){

        int result = 0;

        for (int i : nums){
            result = Math.max(i, result);
        }

        return result;

    }

}
