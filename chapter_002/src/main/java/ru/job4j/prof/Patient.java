package ru.job4j.prof;

/**
 * Дочерний класс - Пациент
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class Patient extends Doctor {
    private int temperature;
    private int pressure;
    private int age;
    private int height;
    private String diagnosis;

    /**
     * метод возвращает температуру пациента
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * метод возвращает давление пациента
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * метод возвращает возраст пациента
     */
    public int getAge() {
        return age;
    }

    /**
     * метод возвращает рост пациента
     */
    public int getHeight() {
        return height;
    }

    /**
     * метод возвращает диагноз пациента
     */
    public String getDiagnosis() {
        return diagnosis;
    }
}
