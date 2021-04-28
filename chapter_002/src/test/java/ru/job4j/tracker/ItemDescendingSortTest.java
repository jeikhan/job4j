package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.sort.Item;
import ru.job4j.tracker.sort.ItemDescendingSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemDescendingSortTest {
    @Test
    public void sortDesc() {
        List<Item> list = new ArrayList<>();

        list.add(new Item("May"));
        list.add(new Item("Clarkson"));
        list.add(new Item("Hammond"));
        list.add(new Item("Stig"));

        list.sort(new ItemDescendingSort());

        List<Item> expect = Arrays.asList(
                new Item("Stig"),
                new Item("May"),
                new Item("Hammond"),
                new Item("Clarkson")
        );
        assertThat(list, is(expect));
    }
}