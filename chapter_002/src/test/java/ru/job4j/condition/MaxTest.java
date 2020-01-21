package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenFirstMax() {
        Max check = new Max();
        int result = check.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondMax() {
        Max check = new Max();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        Max check = new Max();
        int result = check.max(3, 2, 8, 0);
        assertThat(result, is(8));
    }

    @Test
    public void whenNotMax() {
        Max check = new Max();
        int result = check.max(8, 8, 8, 8);
        assertThat(result, is(8));
    }
}