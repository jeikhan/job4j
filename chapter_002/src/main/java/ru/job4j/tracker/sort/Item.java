package ru.job4j.tracker.sort;

import java.util.Objects;

/**
 * Класс Item - модель данных.
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Item implements Comparable<Item> {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String names) {
        this.name = names;
    }

    @Override
    public int compareTo(Item obj) {
        return this.name.compareTo(obj.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Item item = (Item) obj;
        return Objects.equals(name, item.name);
    }
}
