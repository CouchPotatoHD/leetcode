package org.ismaylov;

import java.util.Arrays;

public class _2258 {

    public long maximumImportance(int n, int[][] roads) {


        int[] roadsImportance = new int[n];

        for (int[] road : roads) {
            roadsImportance[road[0]]++;
            roadsImportance[road[1]]++;
        }

        Integer[] cities = new Integer[n];

        for (int i = 0; i < n; i++) {
            cities[i] = i;
        }

        Arrays.sort(cities, (o1, o2) -> Integer.compare(roadsImportance[o2], roadsImportance[o1]));

        long sumImportance = 0;

        for (int i = 0; i < n; i++) {
            sumImportance += (long) (n - i) * roadsImportance[cities[i]];
        }

        return sumImportance;
    }

}
