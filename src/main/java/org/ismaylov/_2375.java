package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@LeetCode(
        number = 2375,
        name = "Construct Smallest Number From DI String",
        level = Level.MEDIUM,
        tags = {"String", "Backtracking", "Stack", "Greedy"}
)
public class _2375 {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    public String smallestNumber(String pattern) {

        List<Integer> allPossibleCombinations = new ArrayList<>();
        List<Integer> allPossibleNumberCombinations = generateCombinations(allPossibleCombinations, new Stack<>(), pattern.toCharArray(), 1);

        return String.valueOf(allPossibleNumberCombinations.stream().min(Integer::compareTo).orElse(0));


    }

    List<Integer> generateCombinations(List<Integer> result, Stack<Integer> currentCombination, char[] currentPattern, int numberToApply) {

        if (currentCombination.size() == currentPattern.length + 1) {
            StringBuilder combination = new StringBuilder();
            for (int num : currentCombination) {
                combination.append(num);
            }
            result.add(Integer.valueOf(combination.toString()));
            return result;
        }

        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
            if (currentCombination.contains(i)) {
                continue;
            }
            if (!currentCombination.isEmpty()) {
                char currentMode = currentPattern[currentCombination.size() - 1];
                int lastNumber = currentCombination.peek();
                if ((currentMode == 'I' && i <= lastNumber) || (currentMode == 'D' && i >= lastNumber)) {
                    continue;
                }
            }
            currentCombination.push(i);
            generateCombinations(result, currentCombination, currentPattern, i);
            currentCombination.pop();
        }

        return result;
    }

}
