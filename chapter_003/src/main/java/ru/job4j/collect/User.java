package ru.job4j.collect;

import java.util.Objects;

/**
 * Задание: организовать сортировку
 * по модели User(имя и возраст).
 * @author Evgen Kapaev
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return o.name.equals(name) ? Integer.compare(age, o.age)
                : name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
}
