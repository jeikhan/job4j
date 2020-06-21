package ru.job4j.strategy;

/**
 * Построение треугольника в псевдографике.
 * Шаблон проектирования - стратегия.
 * @author Evgenii Kapaev
 * @version 1.0
 */
public class Triangle implements Shape {

    /**
     * Построение треугольника.
     * @return псевдотреугольник.
     */
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "   ^    " + ln
                + " /   \\ " + ln
                + "/_____\\" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}
