package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckMonoRowTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheckMonoRow.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }
}