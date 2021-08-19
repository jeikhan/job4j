package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] strings = {"Hammond", "Clarkson", "May", "Stig"};
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(strings, comparator);
        System.out.println("result - " + Arrays.toString(strings));
    }
}
