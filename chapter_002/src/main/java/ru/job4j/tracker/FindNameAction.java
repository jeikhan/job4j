package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "Find item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ===");
        String name = input.askStr("Enter name: ");
        System.out.println("---");
        Item[] result = tracker.findByName(name);
        for (int index = 0; index < result.length; index++) {
            System.out.println(
                    "Found item(s):\n" + (index + 1) + ". " + result[index].getName() + " (" + result[index].getId() + ")"
            );
        }
        System.out.println("=========================\n");
        return true;
    }
}
