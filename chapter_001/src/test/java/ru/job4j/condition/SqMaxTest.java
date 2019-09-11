package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void WhenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(3, 2, 8, 0);
        assertThat(result, is(8));
    }

    @Test
    public void WhenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(8, 2, 3, 0);
        assertThat(result, is(8));
    }

    @Test
    public void WhenNotMax() {
        SqMax check = new SqMax();
        int result = check.max(8, 8, 8,8);
        assertThat(result, is(8));
    }
}
