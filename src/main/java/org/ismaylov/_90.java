package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@LeetCode(
        number = 90,
        name = "Subsets II",
        level = Level.MEDIUM,
        tags = {"Array", "Backtracking", "Bit Manipulation"}
)
public class _90 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        constructArr(nums, 0, new ArrayList<>(), res);

        return res;

    }


    void constructArr(int[] nums, int startIndex, List<Integer> subset, List<List<Integer>> res) {

        res.add(new ArrayList<>(subset));

        for (int i = startIndex; i < nums.length; i++) {

            if (i > startIndex && nums[i] == nums[i - 1]) {
                continue;
            }

            subset.add(nums[i]);
            constructArr(nums, i + 1, subset, res);
            subset.removeLast();
        }
    }
}