package ru.job4j.condition;

/**
 * Класс MaxOfTwo выбирает наибольшее число из двух чисел
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class MaxOfTwo {

    /**
     * Метод max сравнивает два числа
     * @param first - первое число
     * @param second - второе число
     * @return result - максимальное число
     */
    public static int max(int first, int second) {
        boolean maximum = true;
        int result = maximum ? first : second;
        return result;
    }
}
