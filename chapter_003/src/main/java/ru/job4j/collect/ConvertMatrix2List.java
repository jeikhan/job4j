package ru.job4j.collect;

import java.util.ArrayList;
import java.util.List;

/**
 * Конвертация двумерного массива в ArrayList.
 * Задача: реализовать обратную конвертацию
 * двумерного массива в список.
 * @author Evgenii Kapaev
 */
public class ConvertMatrix2List {

    /**
     * Конвертация.
     * @param array двумерный массив.
     * @return список.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
