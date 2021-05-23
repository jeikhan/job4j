package ru.job4j.array;

/**
 * class MinDiapason ищет минимальный
 * элемент в указанном диапазоне индексов
 * массива
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class MinDiapason {

    /**
     * findMin сравнивает значение индекса start
     * со значениями записываемыми в min, в
     * диапазоне от start до finish
     *
     * @param array  - заданный массив
     * @param start  - начальный индекс
     * @param finish - конечный индекс
     * @return min - возвращает минимальное значение
     */
    public static int findMin(int[] array, int start, int finish) {
        int minimum = array[start];
        for (int i = start; start <= finish; start++) {
            if (array[start] < minimum) {
                minimum = array[start];
            }
        }
        return minimum;
    }
}
