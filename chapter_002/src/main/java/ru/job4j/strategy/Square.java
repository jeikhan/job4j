package ru.job4j.strategy;

/**
 * Построение квадрата в псевдографике.
 * Шаблон проектирования - стратегия.
 * @author Evgenii Kapaev
 * @version 1.0
 */
public class Square implements Shape {

    /**
     * Построение квадрата.
     * @return псевдоквадрат.
     */
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "=======" + ln
                + "=     =" + ln
                + "=     =" + ln
                + "=======" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Square().draw());
    }
}
