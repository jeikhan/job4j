package ru.job4j.sort;

import java.util.Comparator;

/**
 * Задание: Необходимо реализовать поэлементное сравнение двух списков,
 * т.е. сравниваем элементы двух списков, находящихся на одних и тех же
 * позициях (под одним и тем же индексом). Сравнение в лексикографическом порядке,
 * не используя метод String.compareTo() - можно использовать String.charAt(),
 * Integer.compare(), Character.compare().
 *
 * @author Evgen Kapaev
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int word = Math.min(left.length(), right.length());
        for (int i = 0; i < word; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return Integer.compare(left.charAt(i), right.charAt(i));
            }
        }
        return left.length() - right.length();
    }
}
