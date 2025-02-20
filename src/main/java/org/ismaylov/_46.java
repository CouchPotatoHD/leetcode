package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

@LeetCode(
        number = 46,
        name = "Permutations",
        level = Level.MEDIUM,
        tags = {"Array", "Backtracking"}
)
public class _46 {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        constructArr(nums, new ArrayList<>(), res);

        return res;

    }


    void constructArr(int[] nums, List<Integer> subset, List<List<Integer>> res) {

        if (subset.size() == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        for (int num : nums) {
            if (!subset.contains(num)) {
                subset.add(num);
                constructArr(nums, subset, res);
                subset.removeLast();
            }
        }

    }
}