package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void point2d() {
        Point first = new Point(1, 2);
        Point second = new Point(3, 4);
        double result = first.distance(second);
        double expected = 2.8284271247461903;
        assertEquals(expected, result, 0);
    }

    @Test
    public void point3d() {
        Point first = new Point(1, 2, 3);
        Point second = new Point(3, 4, 5);
        double result = first.distance3d(second);
        double expected = 3.4641016151377544;
        assertEquals(expected, result, 0);
    }
}