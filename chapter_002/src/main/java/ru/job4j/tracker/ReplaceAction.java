package ru.job4j.tracker;

/**
 * Изменение существующей заявки.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class ReplaceAction implements UserAction {

    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Edit item";
    }

    /**
     * Изменение имени существующей заявки по id.
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из метода (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        String id = input.askStr("Enter id current item: ");
        String name = input.askStr("Enter new item name: ");
        out.println("---");
        out.println(
                "Old item: " + tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        tracker.replace(name, id);
        out.println(
                "Updated item: " + tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        out.println("=================\n");
        return true;
    }
}
