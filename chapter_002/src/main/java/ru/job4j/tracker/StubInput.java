package ru.job4j.tracker;

/**
 * Класс реализации интерфейса Input для
 * тестирования в StartUITest.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class StubInput implements Input {

    /**
     * Варианты ответа пользователя.
     */
    private String[] answers;

    /**
     * Счетчик позиции варианта ответа в массиве
     * данных.
     */
    private int position = 0;

    /**
     * Конструктор - инициализация объекта.
     * @param answers данные.
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Опрос данных строкового типа и
     * присваивание им позиции в массиве.
     * @param question опрос данных.
     * @return данные строкового типа.
     */
    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    /**
     * Опрос данных целочисленного типа.
     * @param question опрос данных.
     * @return данные целочисленного типа.
     */
    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
