package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        Assert.assertArrayEquals(rst, expect);
    }

    @Test
    public void whenBound6Then1491625() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25};
        Assert.assertArrayEquals(rst, expect);
    }
}
