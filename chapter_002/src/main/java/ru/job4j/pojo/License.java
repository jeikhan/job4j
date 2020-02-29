package ru.job4j.pojo;

import java.util.Date;

/**
 * Модель данных - водительские права
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class License {

    /** содержит ФИО владельца авто */
    private String owner;

    /** содержит марку авто */
    private String model;

    /** содержит регистрационный номер авто */
    private String code;

    /** содержит дату производства авто */
    private Date created;

    /**
     * Получение значения поля owner
     * @return owner - ФИО владельца авто
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Установка значения поля owner
     * @param owner - ФИО владельца авто
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Получение значения поля model
     * @return model - марка авто
     */
    public String getModel() {
        return model;
    }

    /**
     * Установка значения поля model
     * @param model - марка авто
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Получение значения поля code
     * @return code - номер регистрационного кода
     */
    public String getCode() {
        return code;
    }

    /**
     * Установка значения поля code
     * @param code - номер регистрационного кода
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Получение значения поля created
     * @return created - дата производства
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Установка значения поля created
     * @param created - дата производства
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}
