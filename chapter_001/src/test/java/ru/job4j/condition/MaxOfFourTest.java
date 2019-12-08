package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxOfFourTest {
    @Test
    public void whenThirdMax() {
        MaxOfFour check = new MaxOfFour();
        int result = check.max(3, 2, 8, 0);
        assertThat(result, is(8));
    }

    @Test
    public void whenFirstMax() {
        MaxOfFour check = new MaxOfFour();
        int result = check.max(8, 2, 3, 0);
        assertThat(result, is(8));
    }

    @Test
    public void whenNotMax() {
        MaxOfFour check = new MaxOfFour();
        int result = check.max(8, 8, 8, 8);
        assertThat(result, is(8));
    }
}
