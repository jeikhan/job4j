package ru.job4j.collection.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Коллекции.
 * Задача. Сделать поиск пользователя в справочнике
 * по полям Имя, Фамилия, Телефон, Адрес.
 * upd: добавить реализацию функции высшего порядка
 * в метод поиска пользователя по справочнику.
 *
 * @author Evgenii Kapaev
 * @since 28.04.2021
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = p -> p.getName().contains(key);
        Predicate<Person> surname = p -> p.getSurname().contains(key);
        Predicate<Person> phone = p -> p.getPhone().contains(key);
        Predicate<Person> address = p -> p.getAddress().contains(key);
        Predicate<Person> combine = name.or(surname).or(phone).or(address);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
