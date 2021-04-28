package ru.job4j.tracker.io;

/**
 * Интерфейс отвечает за ввод данных
 * от пользователя.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public interface Input {

    /**
     * Опрос данных строкового типа.
     * @param question опрос данных.
     * @return данные строкового типа.
     */
    String askStr(String question);

    /**
     * Опрос данных целочисленного типа.
     * @param question опрос данных.
     * @return данные целочисленного типа.
     */
    int askInt(String question);
}
