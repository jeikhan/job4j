package ru.job4j.tracker.core;

import ru.job4j.tracker.sort.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Система заявок - Tracker. Консольное приложение.
 *
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Tracker {

    List<Item> items = new ArrayList<>();
    private int ids = 1;

    /**
     * Добавляет заявку в хранилище
     *
     * @param item - новая заявка
     */
    public List<Item> add(Item item) {
        item.setId(ids++);
        items.add(item);
        return items;
    }

    /**
     * Поиск позиции заявки по id
     *
     * @return позиция заявки
     */
    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * Поиск и замена существующей заявки
     *
     * @param item - новая заявка
     * @param id   - уникальный ключ существующей заявки
     * @return результат операции("успешно" или "не успешно")
     */
    public boolean replace(String item, int id) {
        boolean result = false;
        int index = indexOf(id);
        if (items.get(index).getId() == id) {
            Item newItem = new Item(item);
            newItem.setId(id);
            items.set(index, newItem);
            result = true;
        }
        return result;
    }

    /**
     * Поиск и удаление заявки по id
     *
     * @param id - уникальный ключ существующей заявки
     * @return результат операции("успешно" или "не успешно")
     */
    public boolean delete(int id) {
        boolean result = false;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                items.remove(items.get(index));
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Вовзращает список всех заявок
     *
     * @return массив заявок
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Возвращает заявки найденные по имени
     *
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
     *
     * @param id - уникальный ключ
     * @return заявки совпавшие при сравнении id с аргументом
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

}
