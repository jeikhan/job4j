package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterJTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.roubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 140;
        float expected = 2.3333333f;
        float out = Converter.roubleToDollar(in);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void euroToRuble() {
        int in = 140;
        int expected = 9800;
        int out = Converter.euroToRouble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {
        int in = 140;
        int expected = 8400;
        int out = Converter.dollarToRouble(in);
        Assert.assertEquals(expected, out);
    }
}
