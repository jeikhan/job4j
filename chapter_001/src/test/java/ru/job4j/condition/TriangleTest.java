package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class TriangleTest {
    @Test
    public void WhenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void WhenNotExist() {
        boolean result = Triangle.exist(2.0, 2.0, 5.0);
        assertThat(result, is(false));
    }
}
