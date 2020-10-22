package ru.job4j.collect;

import java.util.List;

/**
 * Конвертация ArrayList в двумерный массив.
 * Задача: дописать метод toArray, для
 * правильного увеличения или уменьшения строки
 * или столбца массива.
 * @author Evgenii Kapaev
 */
public class ConvertList2Array {

    /**
     * Конвертация массива.
     * @param list входящий массив - список чисел.
     * @param cells необходимое количество элементов в строке.
     * @return двумерный массив.
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            if (cell < (cells - 1)) {
                cell++;
            } else {
                row++;
                cell = 0;
            }
        }
        return array;
    }
}
