package ru.job4j.array;

/**
 * Class ArrayChar проверяет, что слово
 * начинается с определенной последовательности
 * символов
 *
 * @author Evgeniy Kapaev
 * @since 30.09.19
 * @version 1.0
 */
public class ArrayChar {

    /**
     * Метод startW сравнивает символы начала входного
     * слова с предполагаемым и в результате совпадения
     * возвращает true
     *
     * @param word - предполагаемый массив символов
     * @param pref - входной массив символов
     * @return result - возвращает true или false
     */
    public static boolean startsW(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
