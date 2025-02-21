package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1415,
        name = "The k-th Lexicographical String of All Happy Strings of Length n",
        level = Level.MEDIUM,
        tags = {"String", "Backtracking", "Stack", "Greedy"}
)
public class _1415 {

    private static final char[] ALLOWED_CHARS = new char[]{'a', 'b', 'c'};

    public String getHappyString(int n, int k) {

        List<String> result = new ArrayList<>();
        generateHappyStrings(result, n, "");
        result.sort(String::compareTo);
        return k > result.size() ? "" : result.get(k - 1);
    }


    private void generateHappyStrings(List<String> result, int n, String currentString) {

        if (currentString.length() == n) {
            result.add(currentString);
            return;
        }

        for (char c : ALLOWED_CHARS) {

            if (!currentString.isEmpty() && c == currentString.charAt(currentString.length() - 1)) {
                continue;
            }

            generateHappyStrings(result, n, currentString + c);

        }
    }
}
