package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.sort.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortAscendingTest {
    @Test
    public void sortAscendingTrue() {
        List<Item> list = new ArrayList<>();

        list.add(new Item("May"));
        list.add(new Item("Clarkson"));
        list.add(new Item("Hammond"));
        list.add(new Item("Stig"));

        Collections.sort(list);

        List<Item> expect = Arrays.asList(
                new Item("Clarkson"),
                new Item("Hammond"),
                new Item("May"),
                new Item("Stig")
        );
        assertThat(list, is(expect));
    }
}