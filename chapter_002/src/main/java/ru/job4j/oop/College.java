package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Students students = new Students();
        Freshman freshman = (Students) students;
        Object obj = freshman;
    }
}