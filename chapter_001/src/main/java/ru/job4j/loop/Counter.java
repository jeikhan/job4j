package ru.job4j.loop;

/**
 * Класс Counter считает сумму четных чисел в
 * указанном диапазоне
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Counter {

    /**
     * Метод addition суммирует числа при условии, что
     * они по модулю равны 0
     * @param start - начало диапазона
     * @param finish - конец диапазона
     * @return sum - сумма чисел
     */
    public int addition(int start, int finish) {
        int sum = 0;
        for (start = 1; start <= finish; start++) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
        }
        return sum;
    }
}
