package ru.job4j.condition;

public class ChessBoard {
    public static int wayRook(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 == x2 || y1 == y2) {
                rsl = Math.abs(x2 - x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            }
        }
        return rsl;
    }

    public static int wayElephant(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 != x2 && y1 != y2) {
                int poX = Math.abs(x2 - x1);
                int poY = Math.abs(y2 - y1);
                rsl = poX + poY;
                rsl = poX != 0 && poY != 0 ? poX : rsl;
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
