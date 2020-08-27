package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

/**
 * Шаблон проектирования Singleton.
 * Объект класса находится в поле
 * внутреннего класса.
 */
public class TrackerSinglePrivate {
    private TrackerSinglePrivate() {
    }

    public static TrackerSinglePrivate getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSinglePrivate INSTANCE = new TrackerSinglePrivate();
    }
}
