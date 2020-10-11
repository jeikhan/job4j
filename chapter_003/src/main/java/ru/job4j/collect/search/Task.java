package ru.job4j.collect.search;

/**
 * Очередь с приоритетом на LinkedList.
 * Модель данных.
 * @see PriorityQueue
 * @author Evgenii Kapaev
 */
public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
