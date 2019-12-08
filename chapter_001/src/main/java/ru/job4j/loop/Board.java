package ru.job4j.loop;

/**
 * Класс Board вырисовывоет шахматную доску
 * в псевдографике
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Board {

    /**
     * Метод paint выстраивает последовательность
     * отображения симвода "Х" в ячейках массива,
     * которые делятся нацело и пробела " " в ячейках,
     * которые не делятся нацело
     * @param width - ширина доски
     * @param height - высота доски
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((cell + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
