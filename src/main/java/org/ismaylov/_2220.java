package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 2220,
        name = "Minimum Bit Flips to Convert Number",
        level = Level.EASY,
        tags = {"Bit Manipulation"}
)
public class _2220 {

    public int minBitFlips(int start, int goal) {

        int difference = start ^ goal;

        int result = 0;

        while (difference != 0){
            result += difference & 1;
            difference >>= 1;
        }

        return result;

    }

}
