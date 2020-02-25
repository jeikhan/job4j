package ru.job4j.pojo;

import java.util.Date;

/**
 * Создание модели данных.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Student {
    private String name;
    private String group;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
