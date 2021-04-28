package ru.job4j.tracker.stubs;

import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.actions.UserAction;
import ru.job4j.tracker.core.Tracker;

public class StubAction implements UserAction {
    private boolean call = false;

    @Override
    public String name() {
        return "Stub action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
