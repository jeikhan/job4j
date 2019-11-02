package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(3, 2, 8, 0);
        assertThat(result, is(8));
    }

    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(8, 2, 3, 0);
        assertThat(result, is(8));
    }

    @Test
    public void whenNotMax() {
        SqMax check = new SqMax();
        int result = check.max(8, 8, 8, 8);
        assertThat(result, is(8));
    }
}
