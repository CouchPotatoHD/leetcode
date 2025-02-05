package org.ismaylov;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _786 {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        Comparator<int[]> comparator = Comparator.comparingDouble(o -> (double) o[0] / o[1]);
        int size = calculateSize(arr.length);
        PriorityQueue<int[]> pq = new PriorityQueue<>(size, comparator);

        if (size == 1){
            return new int[]{arr[0], arr[1]};
        }

        for (int i = 0; i < arr.length; i++) {

            int right = arr.length -1;

            while (right != i) {
                pq.offer(new int[]{arr[i], arr[right]});
                right--;
            }
        }

        for (int i = 0; i < k; i++) {
            if (i == k-1) {
                return pq.poll();
            }
            pq.poll();
        }

        return pq.poll();
    }

    int calculateSize(int n) {

        if (n == 2) return 1;

        return (n - 1) * 2;

    }

}
