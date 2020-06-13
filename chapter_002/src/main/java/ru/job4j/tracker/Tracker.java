package ru.job4j.tracker;

import java.util.Arrays;
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
        items[this.position++] = item;
        return item;
    }

    /**
     * Возвращает уникальный ключ для заявки
     * @return уникальный ключ
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(Math.abs(rm.nextLong() + System.currentTimeMillis()));
    }

    /**
     * Поиск и замена существующей заявки
     * @param item - новая заявка
     * @param id - уникальный ключ существующей заявки
     * @return результат операции("успешно" или "не успешно")
     */
    public Item replace(String item, String id) {
        Item result = null;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                items[index].setName(item);
                result = items[index];
            }
        }
        return result;
    }

    /**
     * Поиск и удаление заявки по id
     * @param id - уникальный ключ существующей заявки
     * @return результат операции("успешно" или "не успешно")
     */
    public Item[] delete(String id) {
        Item[] result = new Item[position];
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                for (int j = i; j < position - 1; j++) {
                    items[j] = items[j + 1];
                    result[j] = items[j];
                }
                position--;
                break;
            }
        }
        return Arrays.copyOf(items, position);
    }

    /**
     * Вовзращает список всех заявок
     * @return массив заявок
     */
    public Item[] findAll() {
        Item[] result = Arrays.copyOf(items, position);
        if (result.length == 0) {
            System.out.println("Items not found...");
        }
        return result;
    }

    /**
     * Возвращает заявки найденные по имени
     * @param key - ключевой элемент
     * @return заявки совпавшие при сравнении name и key
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int size = 0;
        for (int index = 0; index < this.position; index++) {
            if (items[index].getName().equals(key)) {
                result[size] = items[index];
                size++;
            }
        }
        if (size == 0) {
            System.out.println("Items not found...");
        }
        return Arrays.copyOf(result, size);
    }

    /**
     * Возвращает заявки найденные по id
     * @param id - уникальный ключ
     * @return заявки совпавшие при сравнении id с аргументом
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < this.position; index++) {
            if (items[index].getId().equals(id)) {
                result = items[index];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("hello");
        tracker.add(item);
        System.out.println("id is " + item.getId());
        System.out.println("name is " + item.getName());
    }
}
