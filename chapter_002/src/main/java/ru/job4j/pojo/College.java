package ru.job4j.pojo;

import java.util.Date;

/**
 * Установка и считывание данных студента
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class College {

    /**
     * Установка значений полей name, group, date и
     * вывод их на консоль
     * @param args - массив параметров
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov Ivan Ivanovich");
        student.setGroup("dvs-10A1");
        student.setDate(new Date());

        System.out.println("Student's name is: " + student.getName());
        System.out.println("Student's group is: " + student.getGroup());
        System.out.println("Student's date is: " + student.getDate());
    }
}
