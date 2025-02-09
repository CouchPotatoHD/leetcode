package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashMap;

@LeetCode(
        number = 2364,
        name = "Count Number of Bad Pairs",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Math", "Counting"}
)
public class _2364 {

    public long countBadPairs(int[] nums) {

        long n = nums.length;

        HashMap<Integer, Integer> resultsMap = new HashMap<>();

        long goodPairsCount = 0;
        long totalPairsCount = (n * (n - 1)) / 2;

        for (int i = 0; i < n; i++) {

            int diff = i - nums[i];

            if (resultsMap.containsKey(diff)) {
                goodPairsCount += resultsMap.get(diff);
            }

            resultsMap.merge(diff, 1, Integer::sum);

            //resultsMap.put(diff, resultsMap.getOrDefault(diff,0) + 1);
        }

        return totalPairsCount - goodPairsCount;

    }
}