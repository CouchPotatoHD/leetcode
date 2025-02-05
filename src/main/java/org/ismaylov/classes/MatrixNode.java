package org.ismaylov.classes;

import java.util.List;

public class MatrixNode {

    public Integer val;
    public List<MatrixNode> next;


    public MatrixNode(Integer val, List<MatrixNode> next) {
        this.val = val;
        this.next = next;
    }

    public MatrixNode(Integer val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public List<MatrixNode> getNext() {
        return next;
    }

    public void setNext(List<MatrixNode> next) {
        this.next = next;
    }
}
