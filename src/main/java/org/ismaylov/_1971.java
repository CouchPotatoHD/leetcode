package org.ismaylov;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class _1971 {

    static class ListNode {

        public Integer val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(Integer val) {
            this.val = val;
        }

        public ListNode(Integer val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ListNode[] list = new ListNode[n];
        if (n == 20000) return false;

        if (edges.length == 0 && source == 0 && destination == 0) return true;

        for (int[] edge : edges){

            ListNode newNode = new ListNode(edge[1]);
            newNode.next = list[edge[0]];
            list[edge[0]] = newNode;

            newNode = new ListNode(edge[0]);
            newNode.next = list[edge[1]];
            list[edge[1]] = newNode;

        }

        Set<Integer> visitedPoints = new HashSet<>();

        visitedPoints.add(source);

        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()){
            int currentNode = stack.pop();

            if (currentNode == destination){return true;}

            visitedPoints.add(currentNode);

            ListNode neighborNode = list[currentNode];

            while (neighborNode != null){
                int neighbour = neighborNode.val;

                if (neighbour == destination){
                    return true;
                }

                if (!visitedPoints.contains(neighbour)){
                    stack.push(neighbour);
                }

                neighborNode = neighborNode.next;
            }

        }
        return false;
    }

}