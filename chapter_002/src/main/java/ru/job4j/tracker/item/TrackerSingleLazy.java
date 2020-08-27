package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

/**
 * Шаблон проектирования Singleton.
 * Используем ленивую загрузку.
 */
public class TrackerSingleLazy {
    private static TrackerSingleLazy instance;

    private TrackerSingleLazy() {
    }

    public static TrackerSingleLazy getInstance() {
        if (instance == null) {
            instance = new TrackerSingleLazy();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
