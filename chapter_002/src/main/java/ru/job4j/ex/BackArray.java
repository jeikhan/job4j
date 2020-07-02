package ru.job4j.ex;

import java.util.Arrays;

/**
 * Работа с исключениями. Нужно было найти
 * ошибку в коде, из-за которой индекс выходил
 * за границу массива.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class BackArray {

    /**
     * Метод переворачивает массив.
     * Результат "Vasya, Nik, Ivan, Petr"
     * @param args массив
     */
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
