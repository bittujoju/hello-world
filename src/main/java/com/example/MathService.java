package com.example;

import java.util.List;

/**
 * Created by trainer11 on 3/28/17.
 */
public class MathService {

    private String operation;
    private List<Integer> n;
    private Integer x;
    private Integer y;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public List<Integer> getN() {
        return n;
    }

    public void setN(List<Integer> n) {
        this.n = n;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
