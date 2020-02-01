package ru.job4j.prof;

/**
 * Родительский класс - специалист
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    /**
     * метод возвращает имя специалиста
     */
    public String getName() {
        return name;
    }

    /**
     * метод возвращает фамилию специалиста
     */
    public String getSurname() {
        return surname;
    }

    /**
     * метод возвращает образование специалиста
     */
    public String getEducation() {
        return education;
    }

    /**
     * метод возвращает дату рождения специалиста
     */
    public int getBirthday() {
        return birthday;
    }
}
