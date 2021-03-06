package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxOfTwoTest {
    @Test
    public void whenMax1To2Then() {
        int result = MaxOfTwo.max(1, 2);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax2To1Then() {
        int result = MaxOfTwo.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void when2To2Then() {
        int result = MaxOfTwo.max(2, 2);
        assertThat(result, is(2));
    }
}
