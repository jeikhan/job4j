package ru.job4j.tracker.actions;

import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.core.Tracker;

/**
 * Выход из программы.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class ExitAction implements UserAction {

    /**
     * Вывод пункта меню в консоль.
     * @return название пункта.
     */
    @Override
    public String name() {
        return "Exit";
    }

    /**
     * Выход из программы за счет возвращения флага false.
     * @param input объект ввода данных.
     * @param tracker доступ к классу Tracker.
     * @return флаг выхода из метода (true или false).
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Program completed...");
        return false;
    }
}
