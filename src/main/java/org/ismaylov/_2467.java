package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.*;

@LeetCode(
        number = 2467,
        name = "Most Profitable Path in a Tree",
        level = Level.MEDIUM,
        tags = {"Array", "Tree", "DFS", "BFS", "Graph"}
)
public class _2467 {

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;

        List<Integer>[] tree = new ArrayList[n];
        for (int i = 0; i < n; i++) tree[i] = new ArrayList<>();
        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }

        int[] bobTime = new int[n];
        Arrays.fill(bobTime, Integer.MAX_VALUE);
        computeBobTime(tree, bob, bobTime);

        return dfs(0, -1, 0, 0, tree, bobTime, amount);
    }

    private void computeBobTime(List<Integer>[] tree, int bob, int[] bobTime) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{bob, 0});
        bobTime[bob] = 0;

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int cur = node[0], time = node[1];

            for (int neighbor : tree[cur]) {
                if (bobTime[neighbor] == Integer.MAX_VALUE) {
                    bobTime[neighbor] = time + 1;
                    queue.add(new int[]{neighbor, time + 1});
                }
            }
        }
    }

    private int dfs(int node, int parent, int time, int income, List<Integer>[] tree, int[] bobTime, int[] amount) {

        if (time < bobTime[node]) {
            income += amount[node];
        } else if (time == bobTime[node]) {
            income += amount[node] / 2;
        }

        boolean isLeaf = true;
        int maxProfit = Integer.MIN_VALUE;

        for (int neighbor : tree[node]) {
            if (neighbor != parent) {
                isLeaf = false;
                maxProfit = Math.max(maxProfit, dfs(neighbor, node, time + 1, income, tree, bobTime, amount));
            }
        }

        return isLeaf ? income : maxProfit;
    }
}