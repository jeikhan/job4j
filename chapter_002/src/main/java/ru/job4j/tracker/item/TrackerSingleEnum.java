package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

/**
 * Шаблон проектирования Singleton.
 * Используем ограниченное количество
 * объектов и энергичную загрузку.
 */
public enum TrackerSingleEnum {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }
}
