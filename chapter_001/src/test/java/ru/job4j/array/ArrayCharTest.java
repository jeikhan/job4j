package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsW(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsW(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotStartWithPrefixThenFalseEvgen() {
        char[] word = {'E', 'v', 'g', 'e', 'n'};
        char[] pref = {'E', 'v', 'g', 'e', 'm'};
        boolean result = ArrayChar.startsW(word, pref);
        assertThat(result, is(false));
    }
}
