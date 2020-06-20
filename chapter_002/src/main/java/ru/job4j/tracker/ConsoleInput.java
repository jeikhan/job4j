package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Реализует интерфейс Input.
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Опрашивает и возвращает введеные с
     * клавиатуры данные.
     * @param question запрос ввода данных.
     * @return введеные данные строкового типа.
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Опрашивает и возвращает введеное с
     * клавиатуры число.
     * @param question запрос ввода данных.
     * @return введеные данные целочисленного типа.
     */
    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
