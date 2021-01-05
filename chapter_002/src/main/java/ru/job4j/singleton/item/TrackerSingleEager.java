package ru.job4j.singleton.item;

import ru.job4j.tracker.Item;

/**
 * Шаблон проектирования Singleton.
 * Используем энергичную загрузку.
 */
public class TrackerSingleEager {
    private static final TrackerSingleEager INSTANCE = new TrackerSingleEager();

    private TrackerSingleEager() {
    }

    public static TrackerSingleEager getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }
}
