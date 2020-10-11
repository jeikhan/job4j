package ru.job4j.collect.search;

import java.util.LinkedList;

/**
 * Очередь с приоритетом на LinkedList.
 * Задача. Реализовать метод put. Метод
 * должен вставлять элемент в нужную позицию,
 * которая определяется по приоритету.
 * @see Task - модель данных.
 * @author Evgenii Kapaev
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
