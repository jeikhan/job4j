package ru.job4j.tracker.actions;

import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.io.Output;
import ru.job4j.tracker.core.Tracker;

/**
 * Удаление существующей заявки.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Delete item";
    }

    /**
     * Удаление существующей заявки по id.
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из программы (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Item deleted...");
        } else {
            out.println("Item not found...");
        }
        return true;
    }
}
