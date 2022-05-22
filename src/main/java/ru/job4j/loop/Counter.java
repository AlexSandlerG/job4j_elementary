package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }
}
