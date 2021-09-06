package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare stringCompare = new StringCompare();
        int rst = stringCompare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare stringCompare = new StringCompare();
        int rst = stringCompare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare stringCompare = new StringCompare();
        int rst = stringCompare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare stringCompare = new StringCompare();
        int rst = stringCompare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare stringCompare = new StringCompare();
        int rst = stringCompare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }
}