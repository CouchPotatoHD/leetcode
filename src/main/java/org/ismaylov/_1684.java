package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashSet;
import java.util.Set;

@LeetCode(
        number = 1684,
        name = "Count the Number of Consistent Strings",
        level = Level.EASY,
        tags = {"String", "Array", "Hash Table", "Bit Manipulation", "Counting"}
)
public class _1684 {

    public int countConsistentStrings(String allowed, String[] words) {

        Set<Character> charSet = new HashSet<>();

        int counter = 0;

        for (char c : allowed.toCharArray()) {
            charSet.add(c);
        }

        for (String word : words) {

            boolean wordMatch = true;

            for (char c : word.toCharArray()) {
                if (!charSet.contains(c)) {
                    wordMatch = false;
                    break;
                }
            }

            if (wordMatch) {
                counter++;
            }
        }

        return counter;

    }

}
