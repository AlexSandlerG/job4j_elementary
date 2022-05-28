package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] mono) {
        boolean rsl = true;
        for (boolean i : mono) {
            if (i != mono[0]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
