package ru.job4j.array;

/**
 * Class EndsWith проверяет, что слово заканчивается
 * с определенной последовательности
 *
 * @author Evgeniy Kapaev
 * @version 1.0
 */
public class EndsWith {

    /**
     * endsWith сравнивает последние символы строк
     *
     * @param word - массив символов - эталон
     * @param post - массив для сравнения
     * @return result - возвращае true или false
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[i] != word[word.length - post.length + i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
