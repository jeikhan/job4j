package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Задача. Преобразовать двумерный массив в список
 * чисел с помощью Stream API и написать тесты.
 *
 * @author Evgenii Kapaev
 * @since 31.08.21
 */
public class MatrixToList {
    public List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
