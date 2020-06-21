package ru.job4j.inheritance.prof;

/**
 * Дочерний класс - инженер-строитель
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Builder extends Engineer {
    private int numHouses;
    private int projects;

    /**
     * метод выводит такие значения переменных как
     * имя, фамилия, образование, дата рождения специалиста
     */
    public void getProfessional(Profession profession) {
    }

    /**
     * метод возвращает количество построенных домов
     */
    public int getNumHouses() {
        return numHouses;
    }

    /**
     * метод возвращает количество проектов завершенных строителем
     */
    public int getProjects(Project project) {
        return projects;
    }
}
