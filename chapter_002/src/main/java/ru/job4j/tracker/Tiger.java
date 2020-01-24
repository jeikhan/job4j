package ru.job4j.tracker;

/**
 * наследование. Конструктор по умолчанию. Дочерний класс
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Tiger extends Animal {

    /**
     * вызов конструктора родительского класса
     */
    public Tiger(String name) {
        super(name);
        System.out.println("class Tiger");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger");
    }
}
