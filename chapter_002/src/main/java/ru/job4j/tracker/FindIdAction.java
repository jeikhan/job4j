package ru.job4j.tracker;

/**
 * Поиск заявки по "id".
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class FindIdAction implements UserAction {

    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Find item by id";
    }

    /**
     * Поиск существующей заявки по "id".
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из метода (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        String id = input.askStr("Enter id: ");
        out.println("---\nFound item:");
        out.println(
                tracker.findById(id).getName() + " (" + tracker.findById(id).getId() + ")"
        );
        out.println("=========================\n");
        return true;
    }
}
