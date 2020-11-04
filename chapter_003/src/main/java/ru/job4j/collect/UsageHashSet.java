package ru.job4j.collect;

import java.util.HashSet;

/**
 * Set, HashSet, Iterator.
 * Задача. Добавить в коллекцию марки авто:
 * Lada, BMW, Volvo, Toyota и вывести их на
 * консоль.
 * @author Evgenii Kapaev
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        autos.add("Lada");
        for (String auto : autos) {
            System.out.println("Auto brand: " + auto);
        }
    }
}
