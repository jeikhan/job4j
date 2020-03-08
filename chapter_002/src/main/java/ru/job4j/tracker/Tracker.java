package ru.job4j.tracker;

import java.util.Random;

/**
 * Система заявок - Tracker. Консольное приложение.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Tracker {

    /** Массив для хранения заявок */
    private final Item[] items = new Item[100];

    /** Указатель ячейки для новой заявки */
    private int position = 0;

    /**
     * Добавляет заявку в хранилище
     * @param item - новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Вовзращает все заявки
     */
    public Item[] findAll() {
        return findAll();
    }

    /**
     * Возвращает заявки найденные по имени
     * @param key - ключевой элемент
     * @return заявки совпавшие при сравнении name и key
     */
    public Item[] findByName(String key) {
        return findByName(key);
    }

    /**
     * Возвращает заявки найденные по id
     * @param id - уникальный ключ
     * @return заявки совпавшие при сравнении id с аргументом
     */
    public Item findById(String id) {
        return findById(id);
    }

    /**
     * Генерирует уникальный ключ для заявки
     * на основании времени и произвольного числа
     * @return уникальный ключ
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
