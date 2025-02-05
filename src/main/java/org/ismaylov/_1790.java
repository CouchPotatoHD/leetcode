package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1790,
        name = "Check if One String Swap Can Make Strings Equal",
        level = Level.EASY,
        tags = {"Hash Table", "String", "Counting"}
)
public class _1790 {

    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.equals(s2)) {
            return true;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        int counter = 0;
        int indexFirst = 0;
        int indexSecond = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                counter++;
                if (counter > 2) {
                    return false;
                } else if (counter == 1) {
                    indexFirst = i;
                } else {
                    indexSecond = i;
                }
            }
        }

        return s1.charAt(indexFirst) == s2.charAt(indexSecond) && s1.charAt(indexSecond) == s2.charAt(indexFirst);

    }
}