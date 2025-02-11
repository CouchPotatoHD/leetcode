package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 3174,
        name = "Clear Digits",
        level = Level.EASY,
        tags = {"String", "Stack", "Simulation"}
)
public class _3174 {

    public String clearDigits(String s) {

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {

            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i = i-2;
            }

        }

        return sb.toString();

    }
}