package ru.job4j.array;

/**
 * Matrix выстраивает таблицу умножения
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Matrix {

    /**
     * multiple создает двухмерный квадратный
     * массив(матрицу) размера size и перемножает
     * строки i и ячейки j
     *
     * @param size - размер квадратного массива(матрицы)
     * @return table - возвращает массив в виде таблицы
     *                 умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
