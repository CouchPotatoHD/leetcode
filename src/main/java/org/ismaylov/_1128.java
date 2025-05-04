package org.ismaylov;

import java.util.*;
import java.util.stream.Collectors;

public class _1128 {

    public int numEquivDominoPairs(int[][] dominoes) {

        List<Integer> left;
        Map<List<Integer>, Integer> pairsMap = new HashMap<>();

        for (int i = 0; i < dominoes.length; i++) {

            left = Arrays.stream(dominoes[i])
                    .boxed()
                    .collect(Collectors.toList());

            List<Integer> rotatedLeft = rotate(left);

            if (pairsMap.containsKey(left)) {
                pairsMap.merge(left, 1, Integer::sum);
                continue;
            }

            if (pairsMap.containsKey(rotatedLeft)) {
                pairsMap.merge(rotatedLeft, 1, Integer::sum);
                continue;
            }

            pairsMap.put(left, 1);
        }

        return pairsMap.values().stream().mapToInt(v -> v * (v - 1) / 2).sum();
    }

    List<Integer> rotate(List<Integer> arr) {
        return Arrays.asList(arr.get(1), arr.get(0));
    }

}
