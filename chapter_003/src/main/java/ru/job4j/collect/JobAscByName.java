package ru.job4j.collect;

import java.util.Comparator;

/**
 * Компаратор по имени, по возрастанию.
 * @author Evgen Kapaev
 */
public class JobAscByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
