package ru.job4j.stream;

import java.util.Objects;

public class StudentMap {
    private Student student;
    private String surname;

    public StudentMap(Student student, String surname) {
        this.student = student;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StudentMap)) {
            return false;
        }
        StudentMap that = (StudentMap) o;
        return student == that.student && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, surname);
    }
}
