package ru.job4j.tracker;

public class SortAscending implements Comparable<SortAscending> {
    private String name;

    public SortAscending(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(SortAscending another) {
        return name.compareTo(another.name);
    }
}
