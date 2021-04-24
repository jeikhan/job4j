package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Задание: Реализовать метод подсчета
 * функции в диапазоне.
 * @author Evgenii Kapaev
 */
public class FuncDiapason {
    /**
     * Вычисление значений заданной функции в диапазоне (start <= x < end).
     * @param start начало диапазона.
     * @param end конец диапазона.
     * @param func функция.
     * @return список значений.
     */
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            double result = func.apply((double) i);
            list.add(result);
        }
        return list;
    }
}
