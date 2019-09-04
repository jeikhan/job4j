package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterJTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 140;
        float expected = 2.3333333f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void EuroToruble() {
        int in = 140;
        int expected = 9800;
        int out = Converter.EuroToruble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void DollarToruble() {
        int in = 140;
        int expected = 8400;
        int out = Converter.DollarToruble(in);
        Assert.assertEquals(expected, out);
    }
}
