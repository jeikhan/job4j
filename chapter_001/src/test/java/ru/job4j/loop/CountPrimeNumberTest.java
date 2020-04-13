package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountPrimeNumberTest {
    @Test
    public void when5() {
        CountPrimeNumber prime = new CountPrimeNumber();
        int count = prime.calculate(20);
        assertThat(count, is(8));
    }

    @Test
    public void when11() {
        CountPrimeNumber prime = new CountPrimeNumber();
        int count = prime.calculate(11);
        assertThat(count, is(5));
    }

    @Test
    public void when1() {
        CountPrimeNumber prime = new CountPrimeNumber();
        int count = prime.calculate(2);
        assertThat(count, is(1));
    }
}
