package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@LeetCode(
        number = 2342,
        name = "Max Sum of a Pair With Equal Sum of Digits",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Sorting", "Heap(Priority Queue)"}
)
public class _2342 {

    public int maximumSum(int[] nums) {

        Map<Integer, Integer> sumMap = new HashMap<>();

        int maxSum = -1;
        int sumCurrDigits;
        int currNum;

        for (int num : nums) {

            currNum = num;
            sumCurrDigits = 0;

            while (currNum > 0) {
                sumCurrDigits += (currNum % 10);
                currNum /= 10;
            }

                if (sumMap.containsKey(sumCurrDigits)) {
                    maxSum = Math.max(maxSum, sumMap.get(sumCurrDigits) + num);
                    if (num > sumMap.get(sumCurrDigits)) {
                        sumMap.put(sumCurrDigits, num);
                    }
                } else {
                    sumMap.put(sumCurrDigits, num);
                }
            }

        return maxSum;

    }
}