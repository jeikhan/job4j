package ru.job4j.pojo;

import java.util.Date;

/**
 * Модель данных. Установка и считывание данных
 * водительских прав.
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Police {

    /**
     * Задаем значения полей owner, model, code, created
     * и выводим значения на консоль
     * @param args - массив параметров
     */
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Evgeniy Kapaev");
        license.setModel("KIA Soul");
        license.setCode("a013aa");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
