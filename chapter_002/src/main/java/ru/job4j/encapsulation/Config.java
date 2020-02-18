package ru.job4j.encapsulation;

/**
 * Упражнение на проставление модификаторов доступа
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
