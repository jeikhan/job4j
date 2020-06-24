package ru.job4j.tracker;

/**
 * Консольный вывод.
 * @author Evgenii Kapaev
 * @version 1.0
 */
public class ConsoleOutput implements Output {

    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
