package ru.job4j.collection;

import java.util.ArrayList;

/**
 * Коллекции.
 * Задача. Добавить три имени ("Petr", "Ivan", "Stepan")
 * и вывести их на консоль с помощью for-each.
 * @author Evgenii Kapaev
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Petr");
        list.add("Ivan");
        list.add("Stepan");
        for (String ar : list) {
            System.out.println(ar);
        }
    }
}
