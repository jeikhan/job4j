package ru.job4j.collect;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Tasks> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Tasks tasks : list) {
            numbers.add(tasks.getNumber());
        }
        return numbers;
    }
}
