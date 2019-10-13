package ru.job4j.array;

/**
 * Class Min ищет минимальный элемент массива
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Min {
    /**
     * findMin сравнивает каждый элемент
     * массива с минимальным эталонным
     *
     * @param array - массив
     * @return - возвращает минимальное значение массива
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
