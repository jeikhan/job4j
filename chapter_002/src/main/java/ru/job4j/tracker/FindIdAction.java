package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        String id = input.askStr("Enter id: ");
        System.out.println("---");
        System.out.println(
                "Found item:\n" + tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        System.out.println("=========================\n");
        return true;
    }
}
