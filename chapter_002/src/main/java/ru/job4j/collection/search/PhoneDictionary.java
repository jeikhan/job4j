package ru.job4j.collection.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Коллекции.
 * Задача. Сделать поиск пользователя в справочнике
 * по полям Имя, Фамилия, Телефон, Адрес.
 * @author Evgenii Kapaev
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = (n) -> n.getName().contains(key);
        Predicate<Person> surname = (s) -> s.getSurname().contains(key);
        Predicate<Person> phone = (p) -> p.getPhone().contains(key);
        Predicate<Person> address = (a) -> a.getAddress().contains(key);
        Predicate<Person> combine = name.or(surname).or(phone).or(address);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
