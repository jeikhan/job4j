package ru.job4j.inheritance.prof;

/**
 * Дочерний класс - врач-стоматолог
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Dentist extends Doctor {
    private boolean deleteTooth;
    private boolean anesthesia;

    /**
     * метод выводит такие значения переменных как
     * имя, фамилия, образование, дата рождения специалиста
     */
    public void getProfessional(Profession profession) {
    }

    /**
     * метод возвращает true или false о необходимости
     * удаления зуба пациенту на основе диагноза
     */
    public boolean isDeleteTooth(Patient patient) {
        return deleteTooth;
    }

    /**
     * метод возвращает true или false о необходимости
     * введения анестезии в зуб
     */
    public boolean isAnesthesia() {
        return anesthesia;
    }
}
