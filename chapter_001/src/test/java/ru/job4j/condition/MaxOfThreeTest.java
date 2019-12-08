package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxOfThreeTest {
    @Test
    public void whenFirstMax() {
        MaxOfThree check = new MaxOfThree();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        MaxOfThree check = new MaxOfThree();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        MaxOfThree check = new MaxOfThree();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenEqual() {
        MaxOfThree check = new MaxOfThree();
        int result = check.max(4, 4, 4);
        assertThat(result, is(4));
    }
}
