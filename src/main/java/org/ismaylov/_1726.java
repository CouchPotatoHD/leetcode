package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 1726,
        name = "Tuple with Same Product",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Counting"}
)
public class _1726 {

    public int tupleSameProduct(int[] nums) {

        int n = nums.length;

        Map<Integer, Integer> tuples = new HashMap<>();
        int total = 0;

        int left;
        int right;

        for (int i = 0; i < n; i++) {
            left = nums[i];
            for (int j = i + 1; j < n; j++) {
                right = nums[j];
                tuples.put(left * right, tuples.getOrDefault(left * right, 0) + 1);
            }
        }


        for (int count : tuples.values()) {
            int pairs = ((count - 1) * count) / 2;
            total += 8 * pairs;
        }

        return total;


    }
}