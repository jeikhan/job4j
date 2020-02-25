package ru.job4j.pojo;

import java.util.Date;

/**
 * устанавливаем значения полям из класса Student и
 * выводим их на консоль
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class College {
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
