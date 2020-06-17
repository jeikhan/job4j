package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== All items ===");
        Item[] allItems = tracker.findAll();
        for (int index = 0; index < allItems.length; index++) {
            System.out.println(
                    (index + 1) + ". " + allItems[index].getName() + " (" + allItems[index].getId() + ")"
            );
        }
        System.out.println("=================\n");
        return true;
    }
}
