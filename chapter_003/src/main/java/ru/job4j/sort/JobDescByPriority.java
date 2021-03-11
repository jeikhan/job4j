package ru.job4j.sort;

import java.util.Comparator;

/**
 * Компаратор по приоритету, по убыванию.
 * @author Evgen Kapaev
 */
public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
