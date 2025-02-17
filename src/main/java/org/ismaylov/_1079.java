package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.HashMap;
import java.util.Map;

@LeetCode(
        number = 1079,
        name = "Letter Tile Possibilities",
        level = Level.MEDIUM,
        tags = {"Hash Table", "String", "Backtracking", "Counting"}
)
public class _1079 {

    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return backtrack(countMap);
    }

    private int backtrack(Map<Character, Integer> countMap) {
        int total = 0;
        for (char c : countMap.keySet()) {
            if (countMap.get(c) > 0) {
                total++;
                countMap.put(c, countMap.get(c) - 1);
                total += backtrack(countMap);
                countMap.put(c, countMap.get(c) + 1);
            }
        }
        return total;
    }

}
