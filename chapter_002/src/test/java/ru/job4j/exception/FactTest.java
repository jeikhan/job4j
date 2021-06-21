package ru.job4j.exception;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenExeption() {
        Fact.calc(-1);
    }
}