package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1980,
        name = "Find Unique Binary String",
        level = Level.MEDIUM,
        tags = {"Array", "HashTable", "String", "Backtracking"}
)
public class _1980 {

    public String findDifferentBinaryString(String[] nums) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            char c = nums[i].charAt(i);
            if (c == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}