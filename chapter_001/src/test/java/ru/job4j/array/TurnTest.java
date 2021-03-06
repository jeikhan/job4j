package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        Assert.assertArrayEquals(result, expect);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[]{5, 4, 3, 2, 1};
        Assert.assertArrayEquals(result, expect);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArrayNine() {
        Turn turner = new Turn();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = turner.back(input);
        int[] expect = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(result, expect);
    }
}
