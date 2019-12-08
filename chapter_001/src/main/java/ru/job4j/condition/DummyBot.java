package ru.job4j.condition;

/**
 * Класс DummyBot имитирует бота, который отвечает
 * на заранее предполагаемые вопросы
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class DummyBot {

    /**
     * Метод answer выбирает ответ в зависимости от
     * поступившего вопроса
     * @param question - входной вопрос
     * @return result - ответ на предполаемый вопрос
     */
    public static String answer(String question) {
        String result = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            result = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            result = "До скорой встречи.";
        }
        return result;
    }
}
