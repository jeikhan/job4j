package ru.job4j.collect;

import java.util.Comparator;

/**
 * Компаратор по приоритету, по возрастанию.
 * @author Evgen Kapaev
 */
public class JobAscByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
