package ru.job4j.array;

/**
 * SortSelected осуществляет сортировку выборкой
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class SortSelected {

    /**
     * sort через методы findMin и indexOf ищет минимальный
     * элемент массива и его индекс в массиве соотвественно.
     * Попарно сравнивает элементы массива через циклы for и
     * выстраивает их в порядке возрастания.
     * findMin ищет минимальный элемент массива data.
     * indexOf ищет индекс минимального элемента min массива data.
     *
     * @param data - исходный массив
     * @return data - возвращает отсортированный массив
     */
    public static int[] sort(int[] data) {
        int minimum = MinDiapason.findMin(data, 0, data.length - 1);
        int index = FindLoopMod.indexOf(data, minimum, 0, data.length);
        int temp = data[0];
        data[0] = minimum;
        data[index] = temp;
        for (int i = 1; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
        return data;
    }
}
