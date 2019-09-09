package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void WhenMax1To2Then() {
        int result = Max.max(1, 2);
        assertThat(result, is(1));
    }

    @Test
    public void WhenMax2To1Then() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void When2To2Then() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
}
