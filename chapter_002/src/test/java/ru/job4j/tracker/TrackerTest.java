package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.core.Tracker;
import ru.job4j.tracker.sort.Item;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class TrackerTest {

    @Test
    public void add() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        List<Item> result = tracker.findAll();
        List<Item> expected = Arrays.asList(test1, test2, test3);
        assertThat(result, is(expected));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        List<Item> expected = Arrays.asList(test3);
        assertThat(tracker.findByName(test3.getName()), is(expected));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        assertThat(tracker.findById(test2.getId()), is(test2));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(bugWithDesc.getName(), id);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}