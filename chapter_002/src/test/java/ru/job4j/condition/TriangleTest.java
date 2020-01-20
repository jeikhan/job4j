package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import ru.job4j.oop.Point;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point a = new Point(5, 0);
        Point b = new Point(1, 2);
        Point c = new Point(3, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 5.999999999999999;
        Assert.assertEquals(expected, result, 0);
    }
}