package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        // findMin ищет минимальный элемент массива data...
        int min = MinDiapason.findMin(data, 0, data.length);
        // indexOf ищет индекс минимального элемента min массива data
        int index = FindLoopMod.indexOf(data, min, 0, data.length);
        int temp = data[0];
        data[0] = min;
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
