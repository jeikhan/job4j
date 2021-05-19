package ru.job4j.calculator;

import static ru.job4j.calculator.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divisionAndSubtract(double first, double second) {
        return division(first, second)
                + subtract(first, second);
    }

    public static double sumAllOperands(double first, double second) {
        return sumAndMultiply(first, second)
                + divisionAndSubtract(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма операций сложения и умножения = " + sumAndMultiply(10, 20));
        System.out.println("Сумма операций деления и вычитания = " + divisionAndSubtract(20, 10));
        System.out.println("Сумма всех операций = " + sumAllOperands(20, 10));
    }
}
