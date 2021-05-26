package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckMonoVerticalTest {
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheckMonoVertical.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int column = 2;
        boolean result = MatrixCheckMonoVertical.monoVertical(input, column);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNotElements() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int column = 2;
        boolean result = MatrixCheckMonoVertical.monoVertical(input, column);
        Assert.assertFalse(result);
    }
}