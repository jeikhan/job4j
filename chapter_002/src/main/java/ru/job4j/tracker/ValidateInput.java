package ru.job4j.tracker;

/**
 * Обеспечение бесперебойной работы приложения
 * на ввод несуществующего пункта меню и ввод
 * строки вместо числа.
 * @author Evgenii Kapaev
 * @version 1.0
 */
public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (IllegalStateException moe) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
