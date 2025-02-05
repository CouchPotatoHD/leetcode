package org.ismaylov;

public class _100278 {

    public long numberOfRightTriangles(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        long numberOfTriangles = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    int rowCount = countRow(grid, i);
                    int colCount = countColumn(grid, j);
                    numberOfTriangles += (long) (rowCount - 1) * (colCount - 1);
                }
            }
        }

        return numberOfTriangles;
    }

    int countRow(int[][] grid, int rowIndex) {
        int count = 0;
        for (int j = 0; j < grid[rowIndex].length; j++) {
            if (grid[rowIndex][j] == 1) {
                count++;
            }
        }
        return count;
    }

    int countColumn(int[][] grid, int colIndex) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][colIndex] == 1) {
                count++;
            }
        }
        return count;
    }

}