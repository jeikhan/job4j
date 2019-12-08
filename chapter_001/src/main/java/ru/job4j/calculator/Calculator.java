package ru.job4j.calculator;

/**
 * Class Calculator выполняет арифметические операции
 * над двумя числами.
 * @author Evgeniy Kapaev (evgenii.kapaev@yandex.ru)
 * @since 22.09.19
 * @version 1.0
 */
public class Calculator {

    /**
     * Метод add производит операцию сложения
     * @param first - первое слагаемое
     * @param second - второе слагаемое
     */
    public static void addition(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Метод div производит операцию деления
     * @param first - делимое
     * @param second - делитель
     */
    public static void division(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Метод multiply производит операцию умножения
     * @param first - множимое
     * @param second - множитель
     */
    public static void multiplication(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Метод subtract производит операцию вычитания
     * @param first - уменьшаемое
     * @param second - вычитаемое
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    public static void main(String[] args) {
        addition(1, 1);
        division(4, 2);
        multiplication(2, 1);
        subtract(10, 5);
    }
}
