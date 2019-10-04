package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopModTest {
    @Test
    public void whenElementNotFind() {
        FindLoopMod find = new FindLoopMod();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int start = 1;
        int finish = 2;
        int result = FindLoopMod.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenElementFind() {
        FindLoopMod find = new FindLoopMod();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoopMod.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenElement8Find() {
        FindLoopMod find = new FindLoopMod();
        int[] input = new int[] {5, 2, 10, 2, 4, 6, 8, 9, 11};
        int value = 8;
        int start = 2;
        int finish = 7;
        int result = FindLoopMod.indexOf(input, value, start, finish);
        int expect = 6;
        assertThat(result, is(expect));
    }
}