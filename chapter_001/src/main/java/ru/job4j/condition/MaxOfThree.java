package ru.job4j.condition;

/**
 * Класс MaxOfThree выбирает наибольшее число из трех чисел
 * @author Evgeniy Kapaev
 * @version 1.1
 */
public class MaxOfThree {

    /**
     * Метод max последовательно попарно сравнивает три числа
     * с помощью тернарного оператора
     * @param first - первое число
     * @param second - второе число
     * @param third - третье число
     * @return secondCouple - максимальное число
     */
    public int max(int first, int second, int third) {
        int secondCouple, firstCouple;
        firstCouple = first >= second ? first : second;
	    secondCouple = firstCouple >= third ? firstCouple : third;
        return secondCouple;
    }
}
