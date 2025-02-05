package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.*;

@LeetCode(
        number = 349,
        name = "Intersection of Two Arrays",
        level = Level.EASY,
        tags = {"Array", "Hash Table", "Two Pointers", "Binary Search", "Sorting"}
)
public class _349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> finalNumbers = new ArrayList<>();

        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for (int i : nums1) {
            nums1Set.add(i);
        }

        for (int i : nums2) {
            nums2Set.add(i);
        }

        nums1Set.forEach(integer -> {

            if (nums2Set.contains(integer)){
                finalNumbers.add(integer);
            }

        });

        int[] result = new int[finalNumbers.size()];

        for (int i = 0; i < finalNumbers.size(); i++) {
            result[i] = finalNumbers.get(i);
        }

        return result;

    }
}