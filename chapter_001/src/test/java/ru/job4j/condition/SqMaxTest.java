package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void WhenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void WhenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 1, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void WhenNotMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 4, 4,4);
        assertThat(result, is(4));
    }
}
