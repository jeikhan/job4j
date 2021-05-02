package ru.job4j.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Задача: Создать ArrayList и заполнить его числами Integer.
 * Получить из ArrayList поток данных. Отфильтровать поток так,
 * чтобы в нем остались только положительные числа.
 * Отфильтрованный поток записать в List.
 * @author Evgenii Kapaev
 * @since 02.05.21
 */
public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-9, -2, 3, 4, 0, -4, 0, 1, -5));
        System.out.print("Массив чисел до фильтрации: " + numbers + "\n");
        List<Integer> positive = numbers.stream().filter(
                n -> n >= 0
        ).collect(Collectors.toList());
        System.out.print("Массив чисел после фильтрации: " + positive);
    }
}
