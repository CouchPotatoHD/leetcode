package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@LeetCode(
        number = 873,
        name = "Length of Longest Fibonacci Subsequence",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Dynamic Programming"}
)
public class _873 {

    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Set<Integer> numSet = new HashSet<>();
        int maxLen = 0;

        for (int num : arr) {
            numSet.add(num);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = arr[i], y = arr[j];
                int length = 2;

                while (numSet.contains(x + y)) {
                    int temp = y;
                    y = x + y;
                    x = temp;
                    length++;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen >= 3 ? maxLen : 0;
    }
}