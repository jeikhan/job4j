package ru.job4j.tracker;

/**
 * Класс Item - модель заявки.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Item {

    /** Уникальный ключ заявки */
    private String id;

    /** Имя заявки */
    private String name;

    /**
     * Конструктор.
     * @param name - имя заявки
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Получение значения уникального ключа заявки
     */
    public String getId() {
        return id;
    }

    /**
     * Установка значения уникального ключа заявки
     * @param id - уникальный ключ
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Получение значения имени заявки
     */
    public String getName() {
        return name;
    }

    /**
     * Установка значения имени заявки
     * @param name - имя заявки
     */
    public void setName(String name) {
        this.name = name;
    }
}
