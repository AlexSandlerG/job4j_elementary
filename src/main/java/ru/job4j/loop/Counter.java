package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int rsl = 0;
        for (int i = start; start <= finish; start++) {
            if (start % 2 == 0) {
                rsl = rsl + start;
            }
        }
        return rsl;
    }
}
