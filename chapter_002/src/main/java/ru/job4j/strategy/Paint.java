package ru.job4j.strategy;

/**
 * Построение псевдографики в консоли.
 * Шаблон проектирования - стратегия.
 * @author Evgenii Kapaev
 * @version 1.0
 */
public class Paint {

    /**
     * Печать псевдографики в консоль.
     * @param shape доступ к рисованию графики.
     */
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}
