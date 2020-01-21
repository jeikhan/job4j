package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void point2d() {
        Point first = new Point(1, 2);
        Point second = new Point(3, 4);
        double result = first.distance(second);
        assertThat(result, is(2.8284271247461903));
    }

    @Test
    public void point3d() {
        Point first = new Point(1, 2, 3);
        Point second = new Point(3, 4, 5);
        double result = first.distance3d(second);
        assertThat(result, is(3.4641016151377544));
    }
}