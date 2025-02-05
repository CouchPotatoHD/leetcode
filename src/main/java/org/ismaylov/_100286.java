package org.ismaylov;

public class _100286 {

    public boolean canMakeSquare(char[][] grid) {
        int blackCount = 0;
        int whiteCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 'B') {
                    blackCount++;
                } else {
                    whiteCount++;
                }
            }
        }

        if (blackCount == 0 || whiteCount == 0) {
            return true;
        }

        if (hasSameColorSquare(grid)) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char original = grid[i][j];
                grid[i][j] = (original == 'B') ? 'W' : 'B';
                if (hasSameColorSquare(grid)) {
                    return true;
                }
                grid[i][j] = original;
            }
        }

        return false;
    }

    private boolean hasSameColorSquare(char[][] grid) {
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (grid[i][j] == grid[i][j + 1] && grid[i][j] == grid[i + 1][j] && grid[i][j] == grid[i + 1][j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

}
