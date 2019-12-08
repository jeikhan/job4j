package ru.job4j.loop;

/**
 * Класс CountPrimeNumber считает количество
 * простых чисел от 1 до finish
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class CountPrimeNumber {

    /**
     * Метод calculate. Изначально считаем, что
     * число простое и инкрементируем переменную
     * count. Если не проходит условие, то декрементируем.
     * @param finish - число, ограничивающее диапазон
     * @return count -  количество простых чисел
     */
    public int calculate(int finish) {
        int count = 0;
        for (int x = 2; x <= finish; x++) {
            count++;
            for (int y = 2; y < x; y++) {
                if ((x % y) == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
