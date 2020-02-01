package ru.job4j.prof;

/**
 * Дочерний класс - инженер-программист
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Programmer extends Engineer {
    private int numLanguages;
    private int projects;

    /**
     * метод выводит такие значения переменных как
     * имя, фамилия, образование, дата рождения специалиста
     */
    public void getProfessional(Profession profession) {
    }

    /**
     * метод возвращает количество языков программирования
     * которыми владеет специалист
     */
    public int getNumLanguages() {
        return numLanguages;
    }

    /**
     * метод возвращает количество проектов завершенных программистом
     */
    public int getProjects(Project project) {
        return projects;
    }
}
