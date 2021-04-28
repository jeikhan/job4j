package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.actions.*;
import ru.job4j.tracker.core.Tracker;
import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.io.Output;
import ru.job4j.tracker.stubs.StubInput;
import ru.job4j.tracker.stubs.StubOutput;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ShowAllAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:"
                        + System.lineSeparator()
                        + "0. Show all items"
                        + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== All items ==="
                        + System.lineSeparator()
                        + "Menu:" + System.lineSeparator()
                        + "0. Show all items"
                        + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "NAME", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new FindNameAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:"
                        + System.lineSeparator()
                        + "0. Find item by name"
                        + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find item by name ==="
                        + System.lineSeparator()
                        + "Menu:" + System.lineSeparator()
                        + "0. Find item by name"
                        + System.lineSeparator()
                        + "1. Exit"
                        + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindId() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "123456789", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new FindIdAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:"
                        + System.lineSeparator()
                        + "0. Find item by id"
                        + System.lineSeparator()
                        + "1. Exit"
                        + System.lineSeparator()
                        + "=== Find item by id ==="
                        + System.lineSeparator()
                        + "Item not found..."
                        + System.lineSeparator()
                        + "Menu:"
                        + System.lineSeparator()
                        + "0. Find item by id"
                        + System.lineSeparator()
                        + "1. Exit"
                        + System.lineSeparator()
        ));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:"
                        + System.lineSeparator()
                        + "0. Exit"
                        + System.lineSeparator()
        ));
    }
}