package ru.job4j.loop;

/**
 * Класс Factorial считает факториал числа
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Factorial {

    /**
     * Метод calculate осуществляет перемноживание
     * чисел через цикл for, начиная с 1
     * @param number - число для подсчета факториала
     * @return result - значение факториала
     */
    public int calculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
