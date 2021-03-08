package ru.job4j.collect;

import java.util.Objects;

/**
 * Задание:
 * 1. Для модели ru.job4j.collection.Job создать 4 компаратора:
 *  - по имени и по возрастанию
 *  - по приоритету и по возрастанию
 *  - по имени и по убыванию
 *  - по приоритету и по убыванию
 * 2. Написать тесты, проверяющие отдельно поведение компараторов.
 * 3. Написать тесты, проверяющие поведение комбинированного компаратора.
 *
 * @author Evgen Kapaev
 */
public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return priority == job.priority && Objects.equals(name, job.name);
    }
}
