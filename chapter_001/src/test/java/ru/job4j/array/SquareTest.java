package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void whenBound6Then1491625() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4, 9, 16};
        Assert.assertArrayEquals(rst, expect);
    }

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }
}
