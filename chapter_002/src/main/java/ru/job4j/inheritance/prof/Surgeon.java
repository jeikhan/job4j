package ru.job4j.inheritance.prof;

/**
 * Дочерний класс - врач-хирург
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Surgeon extends Doctor {
    private int dose;
    private boolean operation;

    /**
     * метод выводит такие значения переменных как
     * имя, фамилия, образование, дата рождения специалиста
     */
    public void getProfessional(Profession profession) {
    }

    /**
     * метод возвращает true или false о необходимости
     * проведения операции пациенту на основании диагноза
     */
    public boolean isOperation(Patient patient) {
        return operation;
    }

    /**
     * метод возвращает дозировку анестезии на основе
     * входящих параметров пациента
     */
    public int anesthesia(Patient patient) {
        return dose;
    }
}
