package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 1352,
        name = "Product of the Last K Numbers",
        level = Level.MEDIUM,
        tags = {"Array", "Math", "Design", "Data Stream", "Prefix Sum"}
)
public class _1352 {

    static class ProductOfNumbers {

        List<Integer> prefixSum;
        int size;

        public ProductOfNumbers() {
            prefixSum = new ArrayList<>(List.of(1));
            this.size = 0;
        }

        public void add(int num) {
            if (num == 0) {
                this.prefixSum = new ArrayList<>(List.of(1));
                this.size = 0;
            } else {
                this.prefixSum.add(num * this.prefixSum.get(this.size));
                this.size++;
            }
        }

        public int getProduct(int k) {
            return k > this.size ? 0 : this.prefixSum.get(this.size) / this.prefixSum.get(this.size - k);
        }
    }
}