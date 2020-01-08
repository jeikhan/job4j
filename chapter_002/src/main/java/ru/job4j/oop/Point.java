package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * рефакторинг кода расстояние между двумя точками
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double result = a.distance(b);
        System.out.println(result);
    }
}
