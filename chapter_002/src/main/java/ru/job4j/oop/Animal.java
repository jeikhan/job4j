package ru.job4j.oop;

/**
 * наследование. Конструктор по умолчанию. Родительский
 * класс
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class Animal {
    public Animal() {
        System.out.println("load Animal");
    }

    public Animal(String name) {
        System.out.println("name is " + name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal("Animal");
        System.out.println("class Animal");
    }
}
