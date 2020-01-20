package ru.job4j.condition;

import ru.job4j.oop.Point;

/**
 * вычисление площади треугольника по координатам его вершин
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    /**
     * Конструктор класса
     * @param ab - длина стороны АВ
     * @param bc - длина стороны ВС
     * @param ac - длина стороны АС
     */
    public Triangle(Point ab, Point bc, Point ac) {
        this.first = ab;
        this.second = bc;
        this.third = ac;
    }

    /**
     * вычисление полупериметра треугольника
     */
    public double period(double ab, double bc, double ac) {
        return (ab + bc + ac) / 2;
    }

    /**
     * проверка существования треугольника с полученными длинами сторон
     */
    private boolean exist(double ab, double ac, double bc) {
        return (ab + bc > ac) && (bc + ac > ab) && (ab + ac > bc);
    }

    /**
     * 1. вычисляем длины сторон через метод distance класса Point по
     * координатам их вершин
     * 2. вычисляем полупериметр треугольника по этим сторонам
     * 3. если треугольник проходит условие существования, вычисляем
     * его площадь по формуле (p * (p - ab) * (p - bc) * (p - ac)),
     * где р - полупериметр, аb, ac, bc - длины сторон
     */
    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, bc, ac);
        if (this.exist(ab, bc, ac)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        Point c = new Point(5, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        System.out.println(result);
    }
}
