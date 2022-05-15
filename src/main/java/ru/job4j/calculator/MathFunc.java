package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int rsl1 = MathFunc.func1(5);
        int rsl2 = MathFunc.func2(4);
        System.out.println(rsl1 + rsl2);
    }
}
