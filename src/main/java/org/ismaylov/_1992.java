package org.ismaylov;

import java.util.ArrayList;
import java.util.List;

public class _1992 {

    public int[][] findFarmland(int[][] land) {

        List<int[]> resultList = new ArrayList<>();
        boolean exit = false;
//        boolean[][] visited = new boolean[land.length][land[0].length];

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {

                if (land[i][j] == 1/* && !visited[i][j]*/) {

                    int rowCounter = i;
                    int colCounter = j;

                    while (rowCounter < land.length && land[rowCounter][j] == 1) {
                        rowCounter++;
                    }
                    while (colCounter < land[i].length && land[i][colCounter] == 1) {
                        colCounter++;
                    }

                    /*for (int n = i; n < rowCounter; n++) {
                        for (int m = j; m < colCounter; m++) {
                            visited[n][m] = true;
                        }
                    }*/

                    resultList.add(new int[]{i, j, rowCounter - (rowCounter == i ? 0 : 1), colCounter - (colCounter == j ? 0 : 1)});

                    if (rowCounter == land.length && colCounter == land[i].length) {
                        exit = true;
                    }
                }
                if(exit) break;
            }
            if(exit) break;
        }


        int[][] resultArr = new int[resultList.size()][];

        for (int i = 0; i < resultList.size(); i++) {
            resultArr[i] = resultList.get(i);
        }

        return resultArr;
    }

}
