package com.ritvik;

/**
 * Created by u6023478 on 12/11/2014.
 */
public class GoodCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int substract(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }
}
