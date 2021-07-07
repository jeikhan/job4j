package ru.job4j.collect;

import java.util.Objects;

public class Tasks {
    private String number;
    private String description;

    public Tasks(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tasks)) {
            return false;
        }
        Tasks tasks = (Tasks) o;
        return Objects.equals(number, tasks.number)
                && Objects.equals(description, tasks.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, description);
    }
}
