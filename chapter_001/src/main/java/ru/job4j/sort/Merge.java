package ru.job4j.sort;

import java.util.Arrays;

/**
 * Class Merge объединяет два массива.
 *
 * @author Evgeniy Kapaev
 * @since 29.11.2019
 */
public class Merge {
    /**
     * Метод merge производит сравнение первых
     * элементов двух массивов и записывает
     * больший из них в третий
     * @param left - первый массив
     * @param right - второй массив
     * @return result - возвращает третий массив
     */
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        int indexResult = 0;
        while (indexResult < result.length) {
            if (indexLeft < left.length && indexRight < right.length) {
                result[indexResult++] = left[indexLeft] < right[indexRight] ? left[indexLeft++] : right[indexRight++];
            } else if (indexLeft < left.length) {
                result[indexResult++] = left[indexLeft++];
            } else {
                result[indexResult++] = right[indexRight++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
