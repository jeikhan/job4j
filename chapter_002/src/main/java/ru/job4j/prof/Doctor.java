package ru.job4j.prof;

/**
 * Дочерний класс - врач
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Doctor extends Profession {
    private int operations;
    private String skills;

    /**
     * метод возвращает количество проведенных операций
     */
    public int getOperations() {
        return operations;
    }

    /**
     * метод возвращает навыки специалиста
     */
    public String getSkills() {
        return skills;
    }
}
