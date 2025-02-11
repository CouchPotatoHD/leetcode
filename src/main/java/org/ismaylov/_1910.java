package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1910,
        name = "Remove All Occurrences of a Substring",
        level = Level.MEDIUM,
        tags = {"String", "Stack", "Simulation"}
)
public class _1910 {

    public String removeOccurrences(String s, String part) {

        StringBuilder sb = new StringBuilder(s);

        while (sb.indexOf(part) > -1) {
            sb.delete(sb.indexOf(part), sb.indexOf(part) + part.length());
        }

        return sb.toString();
    }
}