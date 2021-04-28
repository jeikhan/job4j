package ru.job4j.tracker.actions;

import ru.job4j.tracker.io.Input;
import ru.job4j.tracker.core.Tracker;

/**
 * Интерфейс описывает все действия системы.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public interface UserAction {

    /**
     * Отображает название пункта меню.
     * @return название пункта меню.
     */
    String name();

    /**
     * Действия системы
     * @param input вводимые данные.
     * @param tracker доступ к классу Tracker.
     * @return true или false
     */
    boolean execute(Input input, Tracker tracker);
}
