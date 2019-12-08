package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersOneToTenThenThirty() {
        Counter check = new Counter();
        int result = check.addition(1, 10);
        assertThat(result, is(30));
    }
}
