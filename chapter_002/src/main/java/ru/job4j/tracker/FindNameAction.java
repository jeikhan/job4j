package ru.job4j.tracker;

import java.util.List;

/**
 * Поиск заявки по "name".
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class FindNameAction implements UserAction {
    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Find item by name";
    }

    /**
     * Поиск заявки по "name".
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из метода (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by name ===");
        String name = input.askStr("Enter name: ");
        List<Item> result = tracker.findByName(name);
        for (int index = 0; index < result.size(); index++) {
            out.println(
                    (index + 1) + ". " + result.get(index).getName() + " (" + result.get(index).getId() + ")"
            );
        }
        return true;
    }
}
