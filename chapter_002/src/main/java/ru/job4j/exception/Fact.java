package ru.job4j.exception;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Факториал 0 равен: " + calc(0));
    }

    public static int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Argument must not be less then 0...");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
