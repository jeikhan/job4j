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
     *
     * @param data - исходный массив
     * @return data - возвращает отсортированный массив
     */
    public static int[] sort(int[] data) {

        // findMin ищет минимальный элемент массива data...
        int min = MinDiapason.findMin(data, 0, data.length);

        // indexOf ищет индекс минимального элемента min массива data...
        int index = FindLoopMod.indexOf(data, min, 0, data.length);

        // т.к. min известен, ставим его на 0-ую позицию...
        int temp = data[0];
        data[0] = min;
        data[index] = temp;

        // сравниваем и упорядочиваем оставшиеся элементы массива...
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
