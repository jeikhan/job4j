package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FuncDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FuncDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = FuncDiapason.diapason(5, 8, x -> 4 * x * x + 2 * x + 3);
        List<Double> expected = Arrays.asList(113D, 159D, 213D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExpFunctionThenExpResults() {
        List<Double> result = FuncDiapason.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}