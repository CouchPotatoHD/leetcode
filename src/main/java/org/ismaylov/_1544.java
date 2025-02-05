package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 1544,
        name = "Make The String Great",
        level = Level.EASY,
        tags = {"String", "Stack"}
)
public class _1544 {

    String result;

    public String makeGood(String s) {

        result = s;

        while (!checkValidDeleteBad(result)){
        }

        return result;
    }

    private boolean checkValidDeleteBad(String s){

        for (int i = 0; i < s.length(); i++) {

            if (i + 2 > s.length()){
                return true;
            }

                if (((s.substring(i, i + 1).equalsIgnoreCase(s.substring(i + 1, i + 2))) && (!s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))))){
                    result = deleteBad(s, i, i+1);
                    return false;
                }
        }
        return true;
    }

    private String deleteBad(String s, int beginIndex, int endIndex){
        return new StringBuilder(s).delete(beginIndex, endIndex + 1).toString();
    }
}