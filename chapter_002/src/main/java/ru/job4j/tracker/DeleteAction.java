package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter id: ");
        Item[] newList = tracker.delete(id);
        System.out.println("---");
        for (int index = 0; index < newList.length; index++) {
            System.out.println(
                    (index + 1) + ". " + newList[index].getName() + " (" + newList[index].getId() + ")"
            );
        }
        System.out.println("===================\n");
        return true;
    }
}
