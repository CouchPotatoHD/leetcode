package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 9,
        name = "Palindrome Number",
        level = Level.EASY,
        tags = {"Math"}
)
public class _9 {

    public boolean isPalindrome(int x) {

        if (x<0) return false;
        if (x==0) return true;

      /*
        char[] chars = String.valueOf(x).toCharArray();

        char[] reversedChars = new char[length];

        for (int i = 0; i < length; i++){
            reversedChars[i] = chars[length - 1 - i];
        }*/

        String s = String.valueOf(x);

        return s.contentEquals(new StringBuilder(s).reverse());

        /*return Arrays.equals(chars, reversedChars);*/

    }
}