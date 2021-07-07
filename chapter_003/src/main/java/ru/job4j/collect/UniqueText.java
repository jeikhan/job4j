package ru.job4j.collect;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String el : origin) {
            check.add(el);
        }
        for (String el : duplicate) {
            if (!check.contains(el)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
