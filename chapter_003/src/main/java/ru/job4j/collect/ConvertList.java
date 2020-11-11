package ru.job4j.collect;

import java.util.ArrayList;
import java.util.List;

/**
 * Конвертация листа массивов в один лист Integer.
 * Задача: преобразовать список массивов чисел в список чисел.
 * @author Evgenii Kapaev
 */
public class ConvertList {

    /**
     * Конвертация.
     * @param list список массивов чисел.
     * @return список чисел.
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rls = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rls.add(cell);
            }
        }
        return rls;
    }
}
