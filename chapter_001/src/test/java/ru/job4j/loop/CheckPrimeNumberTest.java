package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void When5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void When4() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(4);
        assertThat(rsl, is(false));
    }
}
