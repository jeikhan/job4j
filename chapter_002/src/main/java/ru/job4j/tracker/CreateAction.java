package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "Create new item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create new Item ===");
        String name = input.askStr("Enter name: ");
        System.out.println("---");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Name: " + item.getName());
        System.out.println("Id: " + item.getId());
        System.out.println("=======================\n");
        return true;
    }
}
