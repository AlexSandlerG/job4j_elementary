package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator {

    private static int x = 5;

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return y / x;
    }

    public double sumAllOperation(int y) {
        return minus(y) + divide(y) + sum(y, x) + multiple(y, x);
    }

    public static void main(String[] args) {
/*
        int one = 1;
        int two = 2;
        int four = 4;
        int six = 6;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
 */
        int rslMinus = minus(8);
        Calculator calculatorDivide = new Calculator();
        int rslDivide = calculatorDivide.divide(10);
        double rslSumAll = calculatorDivide.sumAllOperation(6);
        System.out.println(rslMinus + System.lineSeparator()
                + rslDivide + System.lineSeparator() + rslSumAll);
    }
}