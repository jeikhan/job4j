package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Система заявок - Tracker. Консольное приложение.
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Tracker {

    /** Массив для хранения заявок */
    List<Item> items = new ArrayList<>();

    /**
     * Добавляет заявку в хранилище
     * @param item - новая заявка
     */
    public List<Item> add(Item item) {
        item.setId(generateId());
        this.items.add(item);
        return items;
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
    public boolean replace(String item, String id) {
        boolean result = false;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                items.get(index).setName(item);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Поиск и удаление заявки по id
     * @param id - уникальный ключ существующей заявки
     * @return результат операции("успешно" или "не успешно")
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(items.get(i));
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Вовзращает список всех заявок
     * @return массив заявок
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Возвращает заявки найденные по имени
     * @param key - ключевой элемент
     * @return заявки совпавшие при сравнении name и key
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item list : items) {
            if (list.getName().equals(key)) {
                result.add(list);
            }
        }
        if (result.size() == 0) {
            System.out.println("Items not found...");
        }
        return result;
    }

    /**
     * Возвращает заявки найденные по id
     * @param id - уникальный ключ
     * @return заявки совпавшие при сравнении id с аргументом
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < this.items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                result = items.get(index);
            }
        }
        return result;
    }

}
