package ru.job4j.inheritance;

/**
 * Задача на переопределение метода -
 * вывод отчета на консоль.
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class TextReport {

    /**
     * метод возвращает название отчета и его содержимое
     * в заданном формате
     * @param name - название отчета
     * @param body - содержимое отчета
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
