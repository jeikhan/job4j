package ru.job4j.inheritance.prof;

/**
 * Дочерний класс - инженер
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Engineer extends Profession {
    private String[] skills;
    private int projects;

    /**
     * метод возвращает навыки специалиста
     */
    public String[] getSkills() {
        return skills;
    }

    /**
     * метод возвращает количество завершенных проектов
     */
    public int getProjects(Project project) {
        return projects;
    }
}
