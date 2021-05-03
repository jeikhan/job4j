package ru.job4j.stream;

import java.util.Objects;

/**
 * Задача: В школе пришло требование разделить 9А класс на три класса.
 * У каждого ученика есть общий балл по всем предметам:  int score.
 * score - может быть в диапазоне от 0 до 100.
 * Учеников нужно поделить на следующие группы.
 * 10А диапазон балла [70: 100],
 * 10Б диапазон балла [50: 70);
 * 10B диапазон балла (0: 50);
 *
 * Модель ученика.
 * @author Evgenii Kapaev
 * @since 03.05.21
 */
public class Student {
    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }
}
