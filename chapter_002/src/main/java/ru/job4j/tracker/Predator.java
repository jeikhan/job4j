package ru.job4j.tracker;

/**
 * наследование. Конструктор по умолчанию. Дочерний класс
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Predator extends Animal {

    /**
     * вызов конструктора родительского класса
     */
    public Predator() {
        super();
        System.out.println("class Predator");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
