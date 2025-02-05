package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 3151,
        name = "Special Array I",
        level = Level.EASY,
        tags = {"Array"}
)
public class _3151 {

    public boolean isArraySpecial(int[] nums) {

        if (nums.length == 0) return true;

        boolean isSpecial = true;


        for (int i = 0; i < nums.length - 1; i++) {

            int left = nums[i] % 2;
            int right = nums[i+1] % 2;

            if ((left ^ right) == 0) {
                isSpecial = false;
                break;
            }

        }

        return isSpecial;

    }

}
