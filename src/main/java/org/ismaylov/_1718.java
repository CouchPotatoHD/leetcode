package org.ismaylov;

import java.util.HashSet;

public class _1718 {

    public int[] constructDistancedSequence(int n) {

        int[] resultList = new int[2 * n - 1];
        assignNextNumber(new HashSet<>(), resultList, 0, n);

        return resultList;

    }

    private boolean assignNextNumber(HashSet<Integer> used, int[] resultList, int index, int n) {

        if (index == resultList.length) {
            return true;
        }

        if (resultList[index] != 0) {
            return assignNextNumber(used, resultList, index + 1, n);
        }

        for (int i = n; i >= 1; i--) {

            if (used.contains(i)) {
                continue;
            }
            if (i > 1 && (i+index>=resultList.length || resultList[i+index]!=0)) {
                continue;
            }

            used.add(i);
            resultList[index] = i;

            if (i > 1){
                resultList[i+index] = i;
            }

            if (assignNextNumber(used, resultList, index + 1, n)){
                return true;
            }

            used.remove(i);
            resultList[index] = 0;

            if (i > 1){
                resultList[i+index] = 0;
            }

        }
        return false;
    }

}
