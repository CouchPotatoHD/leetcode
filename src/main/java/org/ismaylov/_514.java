package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@LeetCode(
        number = 514,
        name = "Freedom Trail",
        level = Level.HARD,
        tags = {"String", "Dynamic Programming", "Depth-First Search", "Breadth-First Search"}
)
public class _514 {

    public int findRotateSteps(String ring, String key) {

        List<Map.Entry<Character, Integer>> list = new ArrayList<>();

        char[] ringChars = ring.toCharArray();
        char[] keyChars = key.toCharArray();

        int stepsCount = 0;

        for (int i = 0; i < ringChars.length; i++) {
            list.add(Map.entry(ringChars[i], i));
        }

        int currentIndex = 0;

        for (int i = 0; i < keyChars.length; i++) {

            char c = keyChars[i];

            List<Integer> minIndex = list
                    .stream()
                    .filter(entry -> entry.getKey().equals(c))
                    .map(Map.Entry::getValue)
                    .toList();

            int difference = 0;
            int optimalIndex;

            for (int j = 0; j < minIndex.size(); j++) {

                if (minIndex.get(j) - currentIndex < difference) {
                    difference = minIndex.get(j) - currentIndex;
                    optimalIndex = j;
                }

            }

            //stepsCount = stepsCount + ;




        }


    return 0;

    }

}
