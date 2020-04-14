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
        items[position++] = item;
        return item;
    }

    /**
     * Поиск и замена существующей заявки
     * @param item - новая заявка
     * @param id - уникальный ключ существующей заявки
     * @return результат операции("успешно" или "не успешно")
     */
    public String replace(Item item, String id) {
        String result = "Unsuccesful";
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                items[index] = item;
                result = "Succesful";
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
        return result;
    }

    /**
     * Вовзращает список всех заявок
     * @return массив заявок
     */
    public Item[] findAll() {
        Item[] result = Arrays.copyOf(items, this.position);
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
                result[size] = this.items[index];
                size++;
            }
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
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
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
