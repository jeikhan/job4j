package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter id current item: ");
        String name = input.askStr("Enter new item name: ");
        System.out.println("---");
        System.out.println(
                "Old item: " + tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        tracker.replace(name, id);
        System.out.println(
                "Updated item: " + tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        System.out.println("=================\n");
        return true;
    }
}
