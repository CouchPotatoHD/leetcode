package org.ismaylov;

public class _1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {

        int[] result = new int[queries.length];

        int[] xors = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++){
            xors[i + 1] = xors[i] ^ arr[i];
        }

        for (int i = 0; i < queries.length; i++){
            result[i] = xors[queries[i][0]] ^ xors[queries[i][1] + 1];
        }

        return result;

    }
}
