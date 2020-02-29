package ru.job4j.inheritance;

/**
 * Задача на переопределение метода -
 * вывод отчета на консоль.
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class ReportUsage {

    /**
     * метод main передает аргументы name и body
     * методу generate. Результат выводится на
     * консоль в переменной text.
     * @param args - массив параметров
     */
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
