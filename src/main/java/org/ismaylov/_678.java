package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 678,
        name = "Valid Parenthesis String",
        level = Level.MEDIUM,
        tags = {"String", "Dynamic Programming", "Stack", "Greedy"}
)
public class _678 {

    static final Map<Character, Integer> incrementDecrementMap = new HashMap<>(){{
       put('(', 1);
       put(')', -1);
    }};

    public boolean checkValidString(String s) {

        int counter = 0;
        int starCounter = 0;

        for (char character : s.toCharArray()){
            Integer add = incrementDecrementMap.get(character);
            if (add == null){
                starCounter++;
            }
            else {
                counter = counter + add;
            }
        }

        while (starCounter != 0){

            if (counter == 0){
                break;
            }
            counter = counter < 0 ? counter + 1 : counter -1;
            starCounter--;

        }

        return counter == 0;


    }

}
