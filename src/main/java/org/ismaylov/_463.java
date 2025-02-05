package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

@LeetCode(
        number = 463,
        name = "Island Perimeter",
        level = Level.EASY,
        tags = {"Array", "Depth-First Search", "Breadth-First Search", "Matrix"}
)
public class _463 {

    static final int FULL_PERIMETER = 4;

    public int islandPerimeter(int[][] grid) {

        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {

            boolean gap = false;

            for (int j = 0; j < grid[i].length; j++) {

                if (!gap) {
                    if (grid[i][j] == 1) {

                        perimeter = perimeter + calculatePerimeterOfOneTile(
                                j == 0 ? 0 : grid[i][j-1],
                                j+1 >= grid[i].length ? 0 : grid[i][j+1],
                                i == 0 ? 0 : grid[i-1][j],
                                i == grid.length -1 ? 0 : grid[i+1][j]
                        );

/*                        if (j+1 >= grid[i].length || grid[i][j+1] == 0) {
                            gap = true;
                        }*/

                    }
                }
                else break;
            }
        }
        return perimeter;
    }

    private int calculatePerimeterOfOneTile(int left, int right, int top, int bottom) {

        int sum = left + right + top + bottom;

        if (sum == 0) {
            return FULL_PERIMETER;
        }
        else {
            return FULL_PERIMETER - sum;
        }
    }
}
