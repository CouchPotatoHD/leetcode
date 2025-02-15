package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 2698,
        name = "Find the Punishment Number of an Integer",
        level = Level.MEDIUM,
        tags = {"Math", "Backtracking"}
)
public class _2698 {
    public int punishmentNumber(int n) {

        int result = 0;

        for (int i = 1; i <= n; i++) {

            int square = i * i;
            boolean number = findNumber(square, i, 0);

            result += number ? square : 0;

        }

        return result;

    }

    private static boolean findNumber(int source, int target, int currentSum) {

        if (currentSum == target && source == 0) {
            return true;
        }

        if (source == 0 || currentSum > target) {
            return false;
        }


        int power = 1;

        while (source / power > 0) {
            int part = source % (power * 10);
            if (findNumber(source / (power * 10), target, currentSum + part)) {
                return true;
            }
            power *= 10;
        }

        return false;

    }

}
