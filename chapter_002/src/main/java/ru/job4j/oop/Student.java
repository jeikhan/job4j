package ru.job4j.oop;

/**
 * Класс Student выводит в консоль
 * два сообщения по 3 раза каждое
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe i can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
