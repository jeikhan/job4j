package ru.job4j.pojo;

import java.util.Date;

/**
 * Модель данных. Студент
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Student {

    /** содержит ФИО студента */
    private String name;

    /** содержит номер группы */
    private String group;

    /** содержит дату поступления */
    private Date date;

    /**
     * Получение значения поля name
     * @return name - ФИО студента
     */
    public String getName() {
        return name;
    }

    /**
     * Установка значения поля name
     * @param name - ФИО студента
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение значения поля group
     * @return group - номер группы студента
     */
    public String getGroup() {
        return group;
    }

    /**
     * Установка значения поля group
     * @param group - номер группы студента
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Получение значения поля date
     * @return date - дата поступления
     */
    public Date getDate() {
        return date;
    }

    /**
     * Установка значения поля date
     * @param date - дата поступления
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
