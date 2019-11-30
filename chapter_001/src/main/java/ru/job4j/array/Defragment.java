package ru.job4j.array;

/**
 * Класс Defragment перемещает заполненные ячейки
 * одномерного массива вначало, а пустые в конец
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Defragment {

    /**
     * метод compress сравнивает значение каждой ячейки
     * с null и при совпадении перемещает их в конец
     * @param array - входящий массив
     * @return array - возвращает отсортированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            int nextCell = index + 1;
            if (cell == null) {
                while (array[index] == null & nextCell < array.length) {
                    array[index] = array[nextCell];
                    array[nextCell] = null;
                    nextCell++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
