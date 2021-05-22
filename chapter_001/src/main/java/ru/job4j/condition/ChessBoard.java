package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            if (checkCoordinates(x1, y1, x2, y2)) {
                result = Math.abs(x2 - x1);
            }
        }
        return result;
    }

    public static boolean checkCoordinates(int x1, int y1, int x2, int y2) {
        boolean result = false;
        int[] coordinates = new int[4];
        coordinates[0] = x1;
        coordinates[1] = y1;
        coordinates[2] = x2;
        coordinates[3] = y2;
        for (int num : coordinates) {
            if (num >= 0 && num <= 7) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
