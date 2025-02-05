package org.ismaylov;

public class _1791 {

    public int findCenter(int[][] edges) {

        int[][] maxConnectionsEdge = new int[edges.length + 2][1];

        for (int i = 1; i < edges.length; i++) {

            int[] left = edges[i-1];
            int[] right = edges[edges.length - i];

            for (int edge : left) {

                maxConnectionsEdge[edge][0] = maxConnectionsEdge[edge][0]+1;
                if (maxConnectionsEdge[edge][0] > 1) {
                    return edge;
                }

            }

            for (int edge : right) {

                maxConnectionsEdge[edge][0] = maxConnectionsEdge[edge][0]+1;
                if (maxConnectionsEdge[edge][0] > 1) {
                    return edge;
                }

            }

        }

        return 0;
    }

}
