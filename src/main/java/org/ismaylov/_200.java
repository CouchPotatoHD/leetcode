package org.ismaylov;

import org.ismaylov.classes.MatrixNode;
import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.List;

@LeetCode(
        number = 200,
        name = "Number of Islands",
        level = Level.MEDIUM,
        tags = {"Array", "Depth-First Search", "Breadth-First Search", "Union Find", "Matrix"}
)
public class _200 {
    public int numIslands(char[][] grid) {

        int islands = 0;

        MatrixNode currentNode;
        MatrixNode lastNode = currentNode = null;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {

                    if (grid[i][j] == '1') {

                        currentNode = linkNode(
                                lastNode,
                                j == 0 ? 0 : grid[i][j-1] == '0' ? null : 1,
                                j+1 >= grid[i].length ? null : grid[i][j+1] == 0 ? null : 1,
                                i == 0 ? null : grid[i-1][j] == '0' ? null : 1,
                                i == grid.length -1 ? null : grid[i+1][j] == '0' ? null : 1,

                                grid[i][j] == 0 ? null : 1

                        );
                    }
                lastNode = currentNode;
            }
        }

        return 0;

    }

    private MatrixNode linkNode (MatrixNode current, Integer left, Integer right, Integer top, Integer bottom, Integer val){
        return new MatrixNode(val, List.of());
    }

}
