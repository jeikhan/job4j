package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemDescendingSortTest {
    @Test
    public void sortDesc() {
        List<Item> list = Arrays.asList(
                new Item("Hammond"),
                new Item("Clarkson"),
                new Item("Stig"),
                new Item("May")
        );
        Collections.sort(list, new ItemDescendingSort());
        List<Item> expect = Arrays.asList(
                new Item("Stig"),
                new Item("May"),
                new Item("Hammond"),
                new Item("Clarkson")
        );
        assertThat(list, is(expect));
    }
}