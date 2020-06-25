package ru.job4j.tracker;

/**
 * Вывод списка всех заявок.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Show all items";
    }

    /**
     * Вывод списка всех заявок в консоль.
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из метода (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== All items ===");
        Item[] allItems = tracker.findAll();
        for (int index = 0; index < allItems.length; index++) {
            out.println(
                    (index + 1) + ". " + allItems[index].getName() + " (" + allItems[index].getId() + ")"
            );
        }
        return true;
    }
}
