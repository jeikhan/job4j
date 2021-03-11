package ru.job4j.sort;

import java.util.Comparator;

/**
 * Компаратор по имени, по убыванию.
 * @author Evgen Kapaev
 */
public class JobDescByName  implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
