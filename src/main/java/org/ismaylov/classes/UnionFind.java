package org.ismaylov.classes;

public interface UnionFind {

    void union(int p, int q);

    boolean connected(int p, int q);
}
