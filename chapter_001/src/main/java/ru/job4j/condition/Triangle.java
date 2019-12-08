package ru.job4j.condition;

/**
 * Класс Triangle проверяет существует ли треугольник
 * если известны длины его сторон
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Triangle {

    /**
     * Метод exist сравнивает сумму двух сторон с третьей
     * @param ab - первая сторона
     * @param ac - вторая сторона
     * @param bc - третья сторона
     * @return result - возвращает true, если треугольник существует,
     * false - если нет
     */
    public static boolean exist(double ab, double ac, double bc) {
        boolean first = ab + ac > bc;
        boolean second = ac + bc > ab;
        boolean third = ab + bc > ac;
        boolean result = first & second & third;
        return result;
    }
}
