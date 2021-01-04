package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortAscendingTest {
    @Test
    public void sortAscendingTrue() {
        List<SortAscending> list = new ArrayList<>();
        list.add(new SortAscending("Stig"));
        list.add(new SortAscending("May"));
        list.add(new SortAscending("Hammond"));
        list.add(new SortAscending("Clarkson"));
        List<String> expect = Arrays.asList("Clarkson", "Hammond", "May", "Stig");
        Collections.sort(list);
        assertThat(list, is(expect));
    }
}