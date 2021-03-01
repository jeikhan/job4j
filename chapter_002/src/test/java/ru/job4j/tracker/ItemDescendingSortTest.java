package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
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
        list.sort(new ItemDescendingSort());
        List<String> expect = Arrays.asList(
                "Stig",
                "May",
                "Hammond",
                "Clarkson");
        assertThat(list.hashCode(), is(expect.hashCode()));
    }
}