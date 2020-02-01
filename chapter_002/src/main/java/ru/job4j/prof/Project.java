package ru.job4j.prof;

/**
 * Дочерний класс - проект
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Project {
    private String name;
    private int numberOfProjects;

    /**
     * метод возвращает название проекта
     */
    public String getName() {
        return name;
    }

    /**
     * метод возвращает количество завершенных проектов
     */
    public int getNumberOfProjects() {
        return numberOfProjects;
    }
}
