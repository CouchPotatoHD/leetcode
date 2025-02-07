package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 3160,
        name = "Find the Number of Distinct Colors Among the Balls",
        level = Level.MEDIUM,
        tags = {"Array", "Hash Table", "Simulation"}
)
public class _3160 {

    public int[] queryResults(int limit, int[][] queries) {

        int n = queries.length;

        int[] result = new int[n];

        Map<Integer, Integer> ballColourMap = new HashMap<>();
        Map<Integer, Integer> distinctColourMap = new HashMap<>();

        int ball;
        int colour;

        for (int i = 0; i < n; i++) {

            ball = queries[i][0];
            colour = queries[i][1];

            if (ballColourMap.containsKey(ball)) {
                int existingColour = ballColourMap.get(ball);
                distinctColourMap.computeIfPresent(existingColour, (k, v) -> (v - 1 == 0) ? null : v - 1);
            } else {
                ballColourMap.put(ball, colour);
            }
            ballColourMap.put(ball, colour);
            distinctColourMap.compute(colour, (k, v) -> v == null ? 1 : v + 1);
            result[i] = distinctColourMap.size();

        }

        return result;

    }
}