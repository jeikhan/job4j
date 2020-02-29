package ru.job4j.inheritance;

/**
 * Задача на переопределение метода -
 * вывод отчета на консоль.
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class HtmlReport extends TextReport {

    /**
     * метод возвращает название отчета и его содержимое
     * в заданном формате
     * @param name - название отчета
     * @param body - содержимое отчета
     */
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + " <br/> " + "<span>" + body + "</span>";
    }
}
