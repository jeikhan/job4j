package ru.job4j.array;

/**
 * Class Turn переворачивает массив
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 * @since 27.09.19
 */
public class Turn {

    /**
     * Метод back меняет местами элементы
     * с i по array.length. Количество
     * итераций равно целому числу от
     * (array.length / 2)
     *
     * @param array - исходный массив чисел
     * @return array - возвращает перевернутый
     * массив
     */
    public int[] back(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
