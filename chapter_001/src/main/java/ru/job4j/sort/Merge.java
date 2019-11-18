package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        int indexRls = 0;
        while (indexRls < rsl.length) {
            if (indexLeft < left.length & indexRight < right.length) {
                rsl[indexRls++] = left[indexLeft] < right[indexRight] ? left[indexLeft++] : right[indexRight++];
            } else if (indexLeft < left.length) {
                rsl[indexRls++] = left[indexLeft++];
            } else {
                rsl[indexRls++] = right[indexRight++];
            }
        }
        return rsl;
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
