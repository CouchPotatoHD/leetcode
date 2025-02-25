package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1524,
        name = "Number of Sub-arrays With Odd Sum",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Dynamic Programming", "Prefix Sum"}
)
public class _1524 {

    private static final int MODULO = 1_000_000_007;

    public int numOfSubarrays(int[] nums) {
        int oddCount = 0;
        int evenCount = 1;
        int prefixSum = 0;

        int result = 0;

        for (int num : nums) {
            prefixSum += num;

            if (prefixSum % 2 != 0) {
                result = (result + evenCount) % MODULO;
                oddCount++;
            } else {
                result = (result + oddCount) % MODULO;
                evenCount++;
            }
        }
        return result;
    }
}