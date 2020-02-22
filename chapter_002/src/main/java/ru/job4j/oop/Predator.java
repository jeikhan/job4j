package ru.job4j.oop;

/**
 * наследование. Конструктор по умолчанию. Дочерний класс
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Predator extends Animal {

    /**
     * вызов конструктора родительского класса
     */
    public Predator(String name) {
        super(name);
        System.out.println("class Predator");
    }

    public Predator() {
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Predator predator1 = new Predator("Predator");
    }
}
