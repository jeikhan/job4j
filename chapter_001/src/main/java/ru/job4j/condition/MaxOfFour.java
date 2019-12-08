package ru.job4j.condition;

/**
 * Класс MaxOfFour выбирает наибольшее число из четырех чисел
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class MaxOfFour {

    /**
     * Метод max сравнивает последовательно четыре числа
     * с помошью конструкции if-else-if
     * @param first - первое число
     * @param second - второе число
     * @param third - третье число
     * @param forth - четвертое число
     * @return result - максимум из четырех чисел
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second & first > third & first > forth) {
            result = first;
        } else if (second > third & second > forth) {
            result = second;
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}
