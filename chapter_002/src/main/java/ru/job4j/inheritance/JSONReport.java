package ru.job4j.inheritance;

/**
 * Задача на переопределение метода -
 * вывод отчета на консоль.
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class JSONReport extends TextReport {

    /**
     * метод возвращает название отчета и его содержимое
     * в заданном формате
     * @param name - название отчета
     * @param body - содержимое отчета
     */
    @Override
    public String generate(String name, String body) {
        return "{"
                +
                " <br/> "
                +
                "name: " + name
                +
                " <br/> "
                +
                "body: " + body
                +
                " <br> "
                +
                "}";
    }
}
