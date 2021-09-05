package ru.job4j.collect;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FullSearchTest {
    @Test
    public void extractNumber() {
        List<Tasks> tasks = List.of(
                new Tasks("1", "First desc"),
                new Tasks("2", "Second desc"),
                new Tasks("1", "First desc")
        );
        Set<String> expected = new HashSet<>(Set.of("1", "2"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}