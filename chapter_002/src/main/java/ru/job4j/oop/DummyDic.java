package ru.job4j.oop;

/**
 * класс переводит русское слово в
 * английский аналог
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class DummyDic {

    /**
     * метод engToRus возвращает английское значение
     * слова
     * @return eng - содержит английский аналог
     */
    public String engToRus() {
        String eng = "unknown word";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        String translation = translator.engToRus();
        System.out.println("Неизвестное слово = " + translation);
    }
}
